// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120;

import com.aliyun.tea.*;
import com.aliyun.governance20210120.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("governance", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to apply an account baseline to existing resource accounts.
     * Accounts are enrolled in the account factory in asynchronous mode. After a resource account is created, an account baseline is applied to the account. You can call the <a href="https://help.aliyun.com/document_detail/609062.html">GetEnrolledAccount</a> operation to query the details of the account enrolled in the account factory and check whether the account baseline is applied to the account.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies an account baseline to multiple existing resource accounts at a time.</p>
     * 
     * @param request BatchEnrollAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchEnrollAccountsResponse
     */
    public BatchEnrollAccountsResponse batchEnrollAccountsWithOptions(BatchEnrollAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accounts)) {
            query.put("Accounts", request.accounts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            query.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineItems)) {
            query.put("BaselineItems", request.baselineItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchEnrollAccounts"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchEnrollAccountsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to apply an account baseline to existing resource accounts.
     * Accounts are enrolled in the account factory in asynchronous mode. After a resource account is created, an account baseline is applied to the account. You can call the <a href="https://help.aliyun.com/document_detail/609062.html">GetEnrolledAccount</a> operation to query the details of the account enrolled in the account factory and check whether the account baseline is applied to the account.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies an account baseline to multiple existing resource accounts at a time.</p>
     * 
     * @param request BatchEnrollAccountsRequest
     * @return BatchEnrollAccountsResponse
     */
    public BatchEnrollAccountsResponse batchEnrollAccounts(BatchEnrollAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchEnrollAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a baseline of the account factory.</p>
     * 
     * @param request CreateAccountFactoryBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountFactoryBaselineResponse
     */
    public CreateAccountFactoryBaselineResponse createAccountFactoryBaselineWithOptions(CreateAccountFactoryBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineItems)) {
            query.put("BaselineItems", request.baselineItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineName)) {
            query.put("BaselineName", request.baselineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccountFactoryBaseline"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountFactoryBaselineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a baseline of the account factory.</p>
     * 
     * @param request CreateAccountFactoryBaselineRequest
     * @return CreateAccountFactoryBaselineResponse
     */
    public CreateAccountFactoryBaselineResponse createAccountFactoryBaseline(CreateAccountFactoryBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountFactoryBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an account factory baseline.</p>
     * 
     * @param request DeleteAccountFactoryBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccountFactoryBaselineResponse
     */
    public DeleteAccountFactoryBaselineResponse deleteAccountFactoryBaselineWithOptions(DeleteAccountFactoryBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            query.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccountFactoryBaseline"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccountFactoryBaselineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an account factory baseline.</p>
     * 
     * @param request DeleteAccountFactoryBaselineRequest
     * @return DeleteAccountFactoryBaselineResponse
     */
    public DeleteAccountFactoryBaselineResponse deleteAccountFactoryBaseline(DeleteAccountFactoryBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountFactoryBaselineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to create a new account or manage an existing account and apply the account baseline to the account.
     * Accounts are created in asynchronous mode. After you create an account, you can apply the account baseline to the account. You can call the <a href="~~GetEnrolledAccount~~">GetEnrolledAccount API</a> operation to view the details about the account to obtain the result of applying the account baseline to the account.</p>
     * 
     * <b>summary</b> : 
     * <p>Enrolls an account. You can create a new account or manage an existing account in the account factory.</p>
     * 
     * @param tmpReq EnrollAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnrollAccountResponse
     */
    public EnrollAccountResponse enrollAccountWithOptions(EnrollAccountRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EnrollAccountShrinkRequest request = new EnrollAccountShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNamePrefix)) {
            query.put("AccountNamePrefix", request.accountNamePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountUid)) {
            query.put("AccountUid", request.accountUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            query.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineItems)) {
            query.put("BaselineItems", request.baselineItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payerAccountUid)) {
            query.put("PayerAccountUid", request.payerAccountUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resellAccountType)) {
            query.put("ResellAccountType", request.resellAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnrollAccount"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnrollAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to create a new account or manage an existing account and apply the account baseline to the account.
     * Accounts are created in asynchronous mode. After you create an account, you can apply the account baseline to the account. You can call the <a href="~~GetEnrolledAccount~~">GetEnrolledAccount API</a> operation to view the details about the account to obtain the result of applying the account baseline to the account.</p>
     * 
     * <b>summary</b> : 
     * <p>Enrolls an account. You can create a new account or manage an existing account in the account factory.</p>
     * 
     * @param request EnrollAccountRequest
     * @return EnrollAccountResponse
     */
    public EnrollAccountResponse enrollAccount(EnrollAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enrollAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of an account factory baseline.</p>
     * 
     * @param request GetAccountFactoryBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountFactoryBaselineResponse
     */
    public GetAccountFactoryBaselineResponse getAccountFactoryBaselineWithOptions(GetAccountFactoryBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            query.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountFactoryBaseline"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountFactoryBaselineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of an account factory baseline.</p>
     * 
     * @param request GetAccountFactoryBaselineRequest
     * @return GetAccountFactoryBaselineResponse
     */
    public GetAccountFactoryBaselineResponse getAccountFactoryBaseline(GetAccountFactoryBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountFactoryBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about an account that is enrolled in the account factory.</p>
     * 
     * @param request GetEnrolledAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnrolledAccountResponse
     */
    public GetEnrolledAccountResponse getEnrolledAccountWithOptions(GetEnrolledAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountUid)) {
            query.put("AccountUid", request.accountUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnrolledAccount"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnrolledAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about an account that is enrolled in the account factory.</p>
     * 
     * @param request GetEnrolledAccountRequest
     * @return GetEnrolledAccountResponse
     */
    public GetEnrolledAccountResponse getEnrolledAccount(GetEnrolledAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEnrolledAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of baseline items that are supported by the account factory of Cloud Governance Center (CGC).</p>
     * 
     * @param request ListAccountFactoryBaselineItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccountFactoryBaselineItemsResponse
     */
    public ListAccountFactoryBaselineItemsResponse listAccountFactoryBaselineItemsWithOptions(ListAccountFactoryBaselineItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.names)) {
            query.put("Names", request.names);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versions)) {
            query.put("Versions", request.versions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccountFactoryBaselineItems"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccountFactoryBaselineItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of baseline items that are supported by the account factory of Cloud Governance Center (CGC).</p>
     * 
     * @param request ListAccountFactoryBaselineItemsRequest
     * @return ListAccountFactoryBaselineItemsResponse
     */
    public ListAccountFactoryBaselineItemsResponse listAccountFactoryBaselineItems(ListAccountFactoryBaselineItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccountFactoryBaselineItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of baselines in the account factory.</p>
     * 
     * @param request ListAccountFactoryBaselinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccountFactoryBaselinesResponse
     */
    public ListAccountFactoryBaselinesResponse listAccountFactoryBaselinesWithOptions(ListAccountFactoryBaselinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccountFactoryBaselines"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccountFactoryBaselinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of baselines in the account factory.</p>
     * 
     * @param request ListAccountFactoryBaselinesRequest
     * @return ListAccountFactoryBaselinesResponse
     */
    public ListAccountFactoryBaselinesResponse listAccountFactoryBaselines(ListAccountFactoryBaselinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccountFactoryBaselinesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of accounts that are enrolled in the account factory.</p>
     * 
     * @param request ListEnrolledAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnrolledAccountsResponse
     */
    public ListEnrolledAccountsResponse listEnrolledAccountsWithOptions(ListEnrolledAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnrolledAccounts"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnrolledAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of accounts that are enrolled in the account factory.</p>
     * 
     * @param request ListEnrolledAccountsRequest
     * @return ListEnrolledAccountsResponse
     */
    public ListEnrolledAccountsResponse listEnrolledAccounts(ListEnrolledAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnrolledAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all available information about check items in a governance maturity check, including the name, ID, description, stage, resource metadata, and fixing guide.</p>
     * 
     * @param request ListEvaluationMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEvaluationMetadataResponse
     */
    public ListEvaluationMetadataResponse listEvaluationMetadataWithOptions(ListEvaluationMetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEvaluationMetadata"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEvaluationMetadataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all available information about check items in a governance maturity check, including the name, ID, description, stage, resource metadata, and fixing guide.</p>
     * 
     * @param request ListEvaluationMetadataRequest
     * @return ListEvaluationMetadataResponse
     */
    public ListEvaluationMetadataResponse listEvaluationMetadata(ListEvaluationMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEvaluationMetadataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the non-compliant resource information of a check item, including the name, ID, category, type, region, and related metadata of non-compliant resources.</p>
     * 
     * @param request ListEvaluationMetricDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEvaluationMetricDetailsResponse
     */
    public ListEvaluationMetricDetailsResponse listEvaluationMetricDetailsWithOptions(ListEvaluationMetricDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEvaluationMetricDetails"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEvaluationMetricDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the non-compliant resource information of a check item, including the name, ID, category, type, region, and related metadata of non-compliant resources.</p>
     * 
     * @param request ListEvaluationMetricDetailsRequest
     * @return ListEvaluationMetricDetailsResponse
     */
    public ListEvaluationMetricDetailsResponse listEvaluationMetricDetails(ListEvaluationMetricDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEvaluationMetricDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result and status of a governance maturity check.</p>
     * 
     * @param request ListEvaluationResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEvaluationResultsResponse
     */
    public ListEvaluationResultsResponse listEvaluationResultsWithOptions(ListEvaluationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEvaluationResults"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEvaluationResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result and status of a governance maturity check.</p>
     * 
     * @param request ListEvaluationResultsRequest
     * @return ListEvaluationResultsResponse
     */
    public ListEvaluationResultsResponse listEvaluationResults(ListEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical scores of a governance maturity check.</p>
     * 
     * @param request ListEvaluationScoreHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEvaluationScoreHistoryResponse
     */
    public ListEvaluationScoreHistoryResponse listEvaluationScoreHistoryWithOptions(ListEvaluationScoreHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEvaluationScoreHistory"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEvaluationScoreHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical scores of a governance maturity check.</p>
     * 
     * @param request ListEvaluationScoreHistoryRequest
     * @return ListEvaluationScoreHistoryResponse
     */
    public ListEvaluationScoreHistoryResponse listEvaluationScoreHistory(ListEvaluationScoreHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEvaluationScoreHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a governance maturity check.</p>
     * 
     * @param tmpReq RunEvaluationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunEvaluationResponse
     */
    public RunEvaluationResponse runEvaluationWithOptions(RunEvaluationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunEvaluationShrinkRequest request = new RunEvaluationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metricIds)) {
            request.metricIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metricIds, "MetricIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricIdsShrink)) {
            query.put("MetricIds", request.metricIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunEvaluation"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunEvaluationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a governance maturity check.</p>
     * 
     * @param request RunEvaluationRequest
     * @return RunEvaluationResponse
     */
    public RunEvaluationResponse runEvaluation(RunEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runEvaluationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a baseline of the account factory.</p>
     * 
     * @param request UpdateAccountFactoryBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAccountFactoryBaselineResponse
     */
    public UpdateAccountFactoryBaselineResponse updateAccountFactoryBaselineWithOptions(UpdateAccountFactoryBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            query.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineItems)) {
            query.put("BaselineItems", request.baselineItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineName)) {
            query.put("BaselineName", request.baselineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccountFactoryBaseline"),
            new TeaPair("version", "2021-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccountFactoryBaselineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a baseline of the account factory.</p>
     * 
     * @param request UpdateAccountFactoryBaselineRequest
     * @return UpdateAccountFactoryBaselineResponse
     */
    public UpdateAccountFactoryBaselineResponse updateAccountFactoryBaseline(UpdateAccountFactoryBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccountFactoryBaselineWithOptions(request, runtime);
    }
}
