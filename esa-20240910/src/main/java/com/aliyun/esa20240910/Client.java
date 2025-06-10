// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910;

import com.aliyun.tea.*;
import com.aliyun.esa20240910.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("esa", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>Activates the client based on the certificate ID.</p>
     * 
     * @param request ActivateClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateClientCertificateResponse
     */
    public ActivateClientCertificateResponse activateClientCertificateWithOptions(ActivateClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the client based on the certificate ID.</p>
     * 
     * @param request ActivateClientCertificateRequest
     * @return ActivateClientCertificateResponse
     */
    public ActivateClientCertificateResponse activateClientCertificate(ActivateClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enable Version Management</p>
     * 
     * @param request ActivateVersionManagementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateVersionManagementResponse
     */
    public ActivateVersionManagementResponse activateVersionManagementWithOptions(ActivateVersionManagementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateVersionManagement"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateVersionManagementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enable Version Management</p>
     * 
     * @param request ActivateVersionManagementRequest
     * @return ActivateVersionManagementResponse
     */
    public ActivateVersionManagementResponse activateVersionManagement(ActivateVersionManagementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateVersionManagementWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Applies for a free SSL certificate.</p>
     * 
     * @param request ApplyCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyCertificateResponse
     */
    public ApplyCertificateResponse applyCertificateWithOptions(ApplyCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Applies for a free SSL certificate.</p>
     * 
     * @param request ApplyCertificateRequest
     * @return ApplyCertificateResponse
     */
    public ApplyCertificateResponse applyCertificate(ApplyCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to create or update multiple DNS records at a time. It is suitable for managing a large number of DNS configurations. Supported record types include but are not limited to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI. The operation allows you to configure the priority, flag, tag, and weight for DNS records. In addition, for specific types of records, such as CERT, SSHFP, SMIMEA, and TLSA, advanced settings such as certificate information and encryption algorithms are also supported.
     * Successful and failed records along with error messages are listed in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds DNS records of different record types at a time..</p>
     * 
     * @param tmpReq BatchCreateRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateRecordsResponse
     */
    public BatchCreateRecordsResponse batchCreateRecordsWithOptions(BatchCreateRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchCreateRecordsShrinkRequest request = new BatchCreateRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recordList)) {
            request.recordListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recordList, "RecordList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordListShrink)) {
            query.put("RecordList", request.recordListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to create or update multiple DNS records at a time. It is suitable for managing a large number of DNS configurations. Supported record types include but are not limited to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI. The operation allows you to configure the priority, flag, tag, and weight for DNS records. In addition, for specific types of records, such as CERT, SSHFP, SMIMEA, and TLSA, advanced settings such as certificate information and encryption algorithms are also supported.
     * Successful and failed records along with error messages are listed in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds DNS records of different record types at a time..</p>
     * 
     * @param request BatchCreateRecordsRequest
     * @return BatchCreateRecordsResponse
     */
    public BatchCreateRecordsResponse batchCreateRecords(BatchCreateRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Create WAF Rules</p>
     * 
     * @param tmpReq BatchCreateWafRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateWafRulesResponse
     */
    public BatchCreateWafRulesResponse batchCreateWafRulesWithOptions(BatchCreateWafRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchCreateWafRulesShrinkRequest request = new BatchCreateWafRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configs)) {
            request.configsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configs, "Configs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shared)) {
            request.sharedShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shared, "Shared", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configsShrink)) {
            body.put("Configs", request.configsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesetId)) {
            body.put("RulesetId", request.rulesetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedShrink)) {
            body.put("Shared", request.sharedShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateWafRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateWafRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Create WAF Rules</p>
     * 
     * @param request BatchCreateWafRulesRequest
     * @return BatchCreateWafRulesResponse
     */
    public BatchCreateWafRulesResponse batchCreateWafRules(BatchCreateWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateWafRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes key-value pairs from a namespace at a time based on keys.</p>
     * 
     * @param tmpReq BatchDeleteKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteKvResponse
     */
    public BatchDeleteKvResponse batchDeleteKvWithOptions(BatchDeleteKvRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteKvShrinkRequest request = new BatchDeleteKvShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            body.put("Keys", request.keysShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteKv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes key-value pairs from a namespace at a time based on keys.</p>
     * 
     * @param request BatchDeleteKvRequest
     * @return BatchDeleteKvResponse
     */
    public BatchDeleteKvResponse batchDeleteKv(BatchDeleteKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteKvWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to upload a larger request body than by using <a href="https://help.aliyun.com/document_detail/2850204.html">BatchDeleteKv</a>. For small request bodies, we recommend that you use <a href="https://help.aliyun.com/document_detail/2850204.html">BatchDeleteKv</a> to minimize the server processing time. This operation must be called by using SDKs. The following sample code uses the Golang SDK and BatchDeleteKvWithHighCapacityAdvance to call the operation.
     *     func TestBatchDeleteWithHighCapacity() error {
     *         // Initialize the configurations.
     *         cfg := new(openapi.Config)
     *         cfg.SetAccessKeyId(&quot;xxxxxxxxx&quot;)
     *         cfg.SetAccessKeySecret(&quot;xxxxxxxxxx&quot;)
     *         cli, err := NewClient(cfg)
     *         if err != nil {
     *             return err
     *         }
     *         runtime := &amp;util.RuntimeOptions{}
     *         // Construct a request for deleting key-value pairs at a time.
     *         namespace := &quot;test_batch_put&quot;
     *         rawReq := BatchDeleteKvRequest{
     *             Namespace: &amp;namespace,
     *         }
     *         for i := 0; i &lt; 10000; i++ {
     *             key := fmt.Sprintf(&quot;test_key_%d&quot;, i)
     *             rawReq.Keys = append(rawReq.Keys, &amp;key)
     *         }
     *         payload, err := json.Marshal(rawReq)
     *         if err != nil {
     *             return err
     *         }
     *         // If the payload is greater than 2 MB, call the BatchDeleteKvWithHighCapacity operation for deletion.
     *         reqHighCapacity := BatchDeleteKvWithHighCapacityAdvanceRequest{
     *             Namespace: &amp;namespace,
     *             UrlObject: bytes.NewReader(payload),
     *         }
     *         resp, err := cli.BatchDeleteKvWithHighCapacityAdvance(&amp;reqHighCapacity, runtime)
     *         if err != nil {
     *             return err
     *         }
     *         return nil
     *     }</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes multiple key-value pairs from a namespace at a time based on specified keys. The request body can be up to 100 MB.</p>
     * 
     * @param request BatchDeleteKvWithHighCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteKvWithHighCapacityResponse
     */
    public BatchDeleteKvWithHighCapacityResponse batchDeleteKvWithHighCapacityWithOptions(BatchDeleteKvWithHighCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteKvWithHighCapacity"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteKvWithHighCapacityResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to upload a larger request body than by using <a href="https://help.aliyun.com/document_detail/2850204.html">BatchDeleteKv</a>. For small request bodies, we recommend that you use <a href="https://help.aliyun.com/document_detail/2850204.html">BatchDeleteKv</a> to minimize the server processing time. This operation must be called by using SDKs. The following sample code uses the Golang SDK and BatchDeleteKvWithHighCapacityAdvance to call the operation.
     *     func TestBatchDeleteWithHighCapacity() error {
     *         // Initialize the configurations.
     *         cfg := new(openapi.Config)
     *         cfg.SetAccessKeyId(&quot;xxxxxxxxx&quot;)
     *         cfg.SetAccessKeySecret(&quot;xxxxxxxxxx&quot;)
     *         cli, err := NewClient(cfg)
     *         if err != nil {
     *             return err
     *         }
     *         runtime := &amp;util.RuntimeOptions{}
     *         // Construct a request for deleting key-value pairs at a time.
     *         namespace := &quot;test_batch_put&quot;
     *         rawReq := BatchDeleteKvRequest{
     *             Namespace: &amp;namespace,
     *         }
     *         for i := 0; i &lt; 10000; i++ {
     *             key := fmt.Sprintf(&quot;test_key_%d&quot;, i)
     *             rawReq.Keys = append(rawReq.Keys, &amp;key)
     *         }
     *         payload, err := json.Marshal(rawReq)
     *         if err != nil {
     *             return err
     *         }
     *         // If the payload is greater than 2 MB, call the BatchDeleteKvWithHighCapacity operation for deletion.
     *         reqHighCapacity := BatchDeleteKvWithHighCapacityAdvanceRequest{
     *             Namespace: &amp;namespace,
     *             UrlObject: bytes.NewReader(payload),
     *         }
     *         resp, err := cli.BatchDeleteKvWithHighCapacityAdvance(&amp;reqHighCapacity, runtime)
     *         if err != nil {
     *             return err
     *         }
     *         return nil
     *     }</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes multiple key-value pairs from a namespace at a time based on specified keys. The request body can be up to 100 MB.</p>
     * 
     * @param request BatchDeleteKvWithHighCapacityRequest
     * @return BatchDeleteKvWithHighCapacityResponse
     */
    public BatchDeleteKvWithHighCapacityResponse batchDeleteKvWithHighCapacity(BatchDeleteKvWithHighCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteKvWithHighCapacityWithOptions(request, runtime);
    }

    public BatchDeleteKvWithHighCapacityResponse batchDeleteKvWithHighCapacityAdvance(BatchDeleteKvWithHighCapacityAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "ESA"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        BatchDeleteKvWithHighCapacityRequest batchDeleteKvWithHighCapacityReq = new BatchDeleteKvWithHighCapacityRequest();
        com.aliyun.openapiutil.Client.convert(request, batchDeleteKvWithHighCapacityReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            batchDeleteKvWithHighCapacityReq.url = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        BatchDeleteKvWithHighCapacityResponse batchDeleteKvWithHighCapacityResp = this.batchDeleteKvWithHighCapacityWithOptions(batchDeleteKvWithHighCapacityReq, runtime);
        return batchDeleteKvWithHighCapacityResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Get Expression Matches</p>
     * 
     * @param tmpReq BatchGetExpressionFieldsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetExpressionFieldsResponse
     */
    public BatchGetExpressionFieldsResponse batchGetExpressionFieldsWithOptions(BatchGetExpressionFieldsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchGetExpressionFieldsShrinkRequest request = new BatchGetExpressionFieldsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.expressions)) {
            request.expressionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.expressions, "Expressions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expressionsShrink)) {
            body.put("Expressions", request.expressionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetExpressionFields"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetExpressionFieldsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Get Expression Matches</p>
     * 
     * @param request BatchGetExpressionFieldsRequest
     * @return BatchGetExpressionFieldsResponse
     */
    public BatchGetExpressionFieldsResponse batchGetExpressionFields(BatchGetExpressionFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetExpressionFieldsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures key-value pairs for a namespace at a time based on specified keys.</p>
     * 
     * @param tmpReq BatchPutKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchPutKvResponse
     */
    public BatchPutKvResponse batchPutKvWithOptions(BatchPutKvRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchPutKvShrinkRequest request = new BatchPutKvShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kvList)) {
            request.kvListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kvList, "KvList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kvListShrink)) {
            body.put("KvList", request.kvListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchPutKv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchPutKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures key-value pairs for a namespace at a time based on specified keys.</p>
     * 
     * @param request BatchPutKvRequest
     * @return BatchPutKvResponse
     */
    public BatchPutKvResponse batchPutKv(BatchPutKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchPutKvWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to upload a larger request body than by using <a href="https://help.aliyun.com/document_detail/2850203.html">BatchPutKv</a>. For small request bodies, we recommend that you use <a href="https://help.aliyun.com/document_detail/2850203.html">BatchPutKv</a> to minimize the server processing time. This operation must be called by using SDKs. The following sample code uses the Golang SDK and BatchPutKvWithHighCapacityAdvance to call the operation.
     *     func TestBatchPutKvWithHighCapacity() error {
     *         // Initialize the configurations.
     *         cfg := new(openapi.Config)
     *         cfg.SetAccessKeyId(&quot;xxxxxxxxx&quot;)
     *         cfg.SetAccessKeySecret(&quot;xxxxxxxxxx&quot;)
     *         cli, err := NewClient(cfg)
     *         if err != nil {
     *             return err
     *         }
     *         runtime := &amp;util.RuntimeOptions{}
     *         // Construct a request for uploading key-value pairs at a time.
     *         namespace := &quot;test_batch_put&quot;
     *         numKv := 10000
     *         kvList := make([]<em>BatchPutKvRequestKvList, numKv)
     *         test_value := strings.Repeat(&quot;a&quot;, 10</em>1024)
     *         for i := 0; i &lt; numKv; i++ {
     *             key := fmt.Sprintf(&quot;test_key_%d&quot;, i)
     *             value := test_value
     *             kvList[i] = &amp;BatchPutKvRequestKvList{
     *                 Key:   &amp;key,
     *                 Value: &amp;value,
     *             }
     *         }
     *         rawReq := BatchPutKvRequest{
     *             Namespace: &amp;namespace,
     *             KvList:    kvList,
     *         }
     *         payload, err := json.Marshal(rawReq)
     *         if err != nil {
     *             return err
     *         }
     *         // If the payload is greater than 2 MB, call the BatchPutKvWithHighCapacity operation for upload.
     *         reqHighCapacity := BatchPutKvWithHighCapacityAdvanceRequest{
     *             Namespace: &amp;namespace,
     *             UrlObject: bytes.NewReader(payload),
     *         }
     *         resp, err := cli.BatchPutKvWithHighCapacityAdvance(&amp;reqHighCapacity, runtime)
     *         if err != nil {
     *             return err
     *         }
     *         return nil
     *     }</p>
     * 
     * <b>summary</b> : 
     * <p>Configures key-value pairs for a namespace at a time based on specified keys. The request body can be up to 100 MB.</p>
     * 
     * @param request BatchPutKvWithHighCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchPutKvWithHighCapacityResponse
     */
    public BatchPutKvWithHighCapacityResponse batchPutKvWithHighCapacityWithOptions(BatchPutKvWithHighCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchPutKvWithHighCapacity"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchPutKvWithHighCapacityResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to upload a larger request body than by using <a href="https://help.aliyun.com/document_detail/2850203.html">BatchPutKv</a>. For small request bodies, we recommend that you use <a href="https://help.aliyun.com/document_detail/2850203.html">BatchPutKv</a> to minimize the server processing time. This operation must be called by using SDKs. The following sample code uses the Golang SDK and BatchPutKvWithHighCapacityAdvance to call the operation.
     *     func TestBatchPutKvWithHighCapacity() error {
     *         // Initialize the configurations.
     *         cfg := new(openapi.Config)
     *         cfg.SetAccessKeyId(&quot;xxxxxxxxx&quot;)
     *         cfg.SetAccessKeySecret(&quot;xxxxxxxxxx&quot;)
     *         cli, err := NewClient(cfg)
     *         if err != nil {
     *             return err
     *         }
     *         runtime := &amp;util.RuntimeOptions{}
     *         // Construct a request for uploading key-value pairs at a time.
     *         namespace := &quot;test_batch_put&quot;
     *         numKv := 10000
     *         kvList := make([]<em>BatchPutKvRequestKvList, numKv)
     *         test_value := strings.Repeat(&quot;a&quot;, 10</em>1024)
     *         for i := 0; i &lt; numKv; i++ {
     *             key := fmt.Sprintf(&quot;test_key_%d&quot;, i)
     *             value := test_value
     *             kvList[i] = &amp;BatchPutKvRequestKvList{
     *                 Key:   &amp;key,
     *                 Value: &amp;value,
     *             }
     *         }
     *         rawReq := BatchPutKvRequest{
     *             Namespace: &amp;namespace,
     *             KvList:    kvList,
     *         }
     *         payload, err := json.Marshal(rawReq)
     *         if err != nil {
     *             return err
     *         }
     *         // If the payload is greater than 2 MB, call the BatchPutKvWithHighCapacity operation for upload.
     *         reqHighCapacity := BatchPutKvWithHighCapacityAdvanceRequest{
     *             Namespace: &amp;namespace,
     *             UrlObject: bytes.NewReader(payload),
     *         }
     *         resp, err := cli.BatchPutKvWithHighCapacityAdvance(&amp;reqHighCapacity, runtime)
     *         if err != nil {
     *             return err
     *         }
     *         return nil
     *     }</p>
     * 
     * <b>summary</b> : 
     * <p>Configures key-value pairs for a namespace at a time based on specified keys. The request body can be up to 100 MB.</p>
     * 
     * @param request BatchPutKvWithHighCapacityRequest
     * @return BatchPutKvWithHighCapacityResponse
     */
    public BatchPutKvWithHighCapacityResponse batchPutKvWithHighCapacity(BatchPutKvWithHighCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchPutKvWithHighCapacityWithOptions(request, runtime);
    }

    public BatchPutKvWithHighCapacityResponse batchPutKvWithHighCapacityAdvance(BatchPutKvWithHighCapacityAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "ESA"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        BatchPutKvWithHighCapacityRequest batchPutKvWithHighCapacityReq = new BatchPutKvWithHighCapacityRequest();
        com.aliyun.openapiutil.Client.convert(request, batchPutKvWithHighCapacityReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            batchPutKvWithHighCapacityReq.url = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        BatchPutKvWithHighCapacityResponse batchPutKvWithHighCapacityResp = this.batchPutKvWithHighCapacityWithOptions(batchPutKvWithHighCapacityReq, runtime);
        return batchPutKvWithHighCapacityResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies multiple rules in a specific Web Application Firewall (WAF) ruleset at a time.</p>
     * 
     * @param tmpReq BatchUpdateWafRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateWafRulesResponse
     */
    public BatchUpdateWafRulesResponse batchUpdateWafRulesWithOptions(BatchUpdateWafRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUpdateWafRulesShrinkRequest request = new BatchUpdateWafRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configs)) {
            request.configsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configs, "Configs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shared)) {
            request.sharedShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shared, "Shared", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configsShrink)) {
            body.put("Configs", request.configsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesetId)) {
            body.put("RulesetId", request.rulesetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedShrink)) {
            body.put("Shared", request.sharedShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateWafRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateWafRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies multiple rules in a specific Web Application Firewall (WAF) ruleset at a time.</p>
     * 
     * @param request BatchUpdateWafRulesRequest
     * @return BatchUpdateWafRulesResponse
     */
    public BatchUpdateWafRulesResponse batchUpdateWafRules(BatchUpdateWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUpdateWafRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Blocks URLs.</p>
     * 
     * @param tmpReq BlockObjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BlockObjectResponse
     */
    public BlockObjectResponse blockObjectWithOptions(BlockObjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BlockObjectShrinkRequest request = new BlockObjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            query.put("Extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxage)) {
            query.put("Maxage", request.maxage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BlockObject"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BlockObjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Blocks URLs.</p>
     * 
     * @param request BlockObjectRequest
     * @return BlockObjectResponse
     */
    public BlockObjectResponse blockObject(BlockObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.blockObjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查实时日志slr角色是否已创建</p>
     * 
     * @param request CheckAssumeSlrRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAssumeSlrRoleResponse
     */
    public CheckAssumeSlrRoleResponse checkAssumeSlrRoleWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAssumeSlrRole"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAssumeSlrRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查实时日志slr角色是否已创建</p>
     * @return CheckAssumeSlrRoleResponse
     */
    public CheckAssumeSlrRoleResponse checkAssumeSlrRole() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAssumeSlrRoleWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a specified website name is available.</p>
     * 
     * @param request CheckSiteNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSiteNameResponse
     */
    public CheckSiteNameResponse checkSiteNameWithOptions(CheckSiteNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteName)) {
            query.put("SiteName", request.siteName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSiteName"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSiteNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a specified website name is available.</p>
     * 
     * @param request CheckSiteNameRequest
     * @return CheckSiteNameResponse
     */
    public CheckSiteNameResponse checkSiteName(CheckSiteNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSiteNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the name of a real-time log delivery task.</p>
     * 
     * @param request CheckSiteProjectNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSiteProjectNameResponse
     */
    public CheckSiteProjectNameResponse checkSiteProjectNameWithOptions(CheckSiteProjectNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSiteProjectName"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSiteProjectNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the name of a real-time log delivery task.</p>
     * 
     * @param request CheckSiteProjectNameRequest
     * @return CheckSiteProjectNameResponse
     */
    public CheckSiteProjectNameResponse checkSiteProjectName(CheckSiteProjectNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSiteProjectNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the name of a real-time log delivery task by account.</p>
     * 
     * @param request CheckUserProjectNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUserProjectNameResponse
     */
    public CheckUserProjectNameResponse checkUserProjectNameWithOptions(CheckUserProjectNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUserProjectName"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUserProjectNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the name of a real-time log delivery task by account.</p>
     * 
     * @param request CheckUserProjectNameRequest
     * @return CheckUserProjectNameResponse
     */
    public CheckUserProjectNameResponse checkUserProjectName(CheckUserProjectNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUserProjectNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Commits the unstable code in the staging environment to generate an official code version.</p>
     * 
     * @param request CommitRoutineStagingCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommitRoutineStagingCodeResponse
     */
    public CommitRoutineStagingCodeResponse commitRoutineStagingCodeWithOptions(CommitRoutineStagingCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeDescription)) {
            body.put("CodeDescription", request.codeDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitRoutineStagingCode"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitRoutineStagingCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Commits the unstable code in the staging environment to generate an official code version.</p>
     * 
     * @param request CommitRoutineStagingCodeRequest
     * @return CommitRoutineStagingCodeResponse
     */
    public CommitRoutineStagingCodeResponse commitRoutineStagingCode(CommitRoutineStagingCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.commitRoutineStagingCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new site cache configuration</p>
     * 
     * @param request CreateCacheRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCacheRuleResponse
     */
    public CreateCacheRuleResponse createCacheRuleWithOptions(CreateCacheRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalCacheablePorts)) {
            query.put("AdditionalCacheablePorts", request.additionalCacheablePorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserCacheMode)) {
            query.put("BrowserCacheMode", request.browserCacheMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserCacheTtl)) {
            query.put("BrowserCacheTtl", request.browserCacheTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bypassCache)) {
            query.put("BypassCache", request.bypassCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cacheDeceptionArmor)) {
            query.put("CacheDeceptionArmor", request.cacheDeceptionArmor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cacheReserveEligibility)) {
            query.put("CacheReserveEligibility", request.cacheReserveEligibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkPresenceCookie)) {
            query.put("CheckPresenceCookie", request.checkPresenceCookie);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkPresenceHeader)) {
            query.put("CheckPresenceHeader", request.checkPresenceHeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgeCacheMode)) {
            query.put("EdgeCacheMode", request.edgeCacheMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgeCacheTtl)) {
            query.put("EdgeCacheTtl", request.edgeCacheTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgeStatusCodeCacheTtl)) {
            query.put("EdgeStatusCodeCacheTtl", request.edgeStatusCodeCacheTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeCookie)) {
            query.put("IncludeCookie", request.includeCookie);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeHeader)) {
            query.put("IncludeHeader", request.includeHeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryString)) {
            query.put("QueryString", request.queryString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStringMode)) {
            query.put("QueryStringMode", request.queryStringMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serveStale)) {
            query.put("ServeStale", request.serveStale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortQueryStringForCache)) {
            query.put("SortQueryStringForCache", request.sortQueryStringForCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDeviceType)) {
            query.put("UserDeviceType", request.userDeviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGeo)) {
            query.put("UserGeo", request.userGeo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userLanguage)) {
            query.put("UserLanguage", request.userLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCacheRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCacheRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new site cache configuration</p>
     * 
     * @param request CreateCacheRuleRequest
     * @return CreateCacheRuleResponse
     */
    public CreateCacheRuleResponse createCacheRule(CreateCacheRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCacheRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uses the ESA-managed certificate authority (CA) to issue client certificates.</p>
     * 
     * @param request CreateClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClientCertificateResponse
     */
    public CreateClientCertificateResponse createClientCertificateWithOptions(CreateClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.CSR)) {
            body.put("CSR", request.CSR);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkeyType)) {
            body.put("PkeyType", request.pkeyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityDays)) {
            body.put("ValidityDays", request.validityDays);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uses the ESA-managed certificate authority (CA) to issue client certificates.</p>
     * 
     * @param request CreateClientCertificateRequest
     * @return CreateClientCertificateResponse
     */
    public CreateClientCertificateResponse createClientCertificate(CreateClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add a compression rule</p>
     * 
     * @param request CreateCompressionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCompressionRuleResponse
     */
    public CreateCompressionRuleResponse createCompressionRuleWithOptions(CreateCompressionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brotli)) {
            query.put("Brotli", request.brotli);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gzip)) {
            query.put("Gzip", request.gzip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zstd)) {
            query.put("Zstd", request.zstd);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCompressionRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCompressionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add a compression rule</p>
     * 
     * @param request CreateCompressionRuleRequest
     * @return CreateCompressionRuleResponse
     */
    public CreateCompressionRuleResponse createCompressionRule(CreateCompressionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCompressionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account-level custom scenario policy. You can execute a policy after you associate the policy with a website.</p>
     * 
     * @param request CreateCustomScenePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomScenePolicyResponse
     */
    public CreateCustomScenePolicyResponse createCustomScenePolicyWithOptions(CreateCustomScenePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objects)) {
            query.put("Objects", request.objects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteIds)) {
            query.put("SiteIds", request.siteIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomScenePolicy"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomScenePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account-level custom scenario policy. You can execute a policy after you associate the policy with a website.</p>
     * 
     * @param request CreateCustomScenePolicyRequest
     * @return CreateCustomScenePolicyResponse
     */
    public CreateCustomScenePolicyResponse createCustomScenePolicy(CreateCustomScenePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomScenePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a containerized application. You can deploy and release a version of the application across points of presence (POPs).</p>
     * 
     * @param request CreateEdgeContainerAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEdgeContainerAppResponse
     */
    public CreateEdgeContainerAppResponse createEdgeContainerAppWithOptions(CreateEdgeContainerAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckFailTimes)) {
            body.put("HealthCheckFailTimes", request.healthCheckFailTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHost)) {
            body.put("HealthCheckHost", request.healthCheckHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            body.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            body.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            body.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckPort)) {
            body.put("HealthCheckPort", request.healthCheckPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckSuccTimes)) {
            body.put("HealthCheckSuccTimes", request.healthCheckSuccTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            body.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckType)) {
            body.put("HealthCheckType", request.healthCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            body.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePort)) {
            body.put("ServicePort", request.servicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPort)) {
            body.put("TargetPort", request.targetPort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeContainerApp"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeContainerAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a containerized application. You can deploy and release a version of the application across points of presence (POPs).</p>
     * 
     * @param request CreateEdgeContainerAppRequest
     * @return CreateEdgeContainerAppResponse
     */
    public CreateEdgeContainerAppResponse createEdgeContainerApp(CreateEdgeContainerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEdgeContainerAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a domain name with a containerized application. This way, requests destined for the associated domain name are forwarded to the application.</p>
     * 
     * @param request CreateEdgeContainerAppRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEdgeContainerAppRecordResponse
     */
    public CreateEdgeContainerAppRecordResponse createEdgeContainerAppRecordWithOptions(CreateEdgeContainerAppRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            body.put("RecordName", request.recordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeContainerAppRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeContainerAppRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a domain name with a containerized application. This way, requests destined for the associated domain name are forwarded to the application.</p>
     * 
     * @param request CreateEdgeContainerAppRecordRequest
     * @return CreateEdgeContainerAppRecordResponse
     */
    public CreateEdgeContainerAppRecordResponse createEdgeContainerAppRecord(CreateEdgeContainerAppRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEdgeContainerAppRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a version for a containerized application. You can iterate the application based on the version.</p>
     * 
     * @param tmpReq CreateEdgeContainerAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEdgeContainerAppVersionResponse
     */
    public CreateEdgeContainerAppVersionResponse createEdgeContainerAppVersionWithOptions(CreateEdgeContainerAppVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEdgeContainerAppVersionShrinkRequest request = new CreateEdgeContainerAppVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.containers)) {
            request.containersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.containers, "Containers", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containersShrink)) {
            body.put("Containers", request.containersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeContainerAppVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeContainerAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a version for a containerized application. You can iterate the application based on the version.</p>
     * 
     * @param request CreateEdgeContainerAppVersionRequest
     * @return CreateEdgeContainerAppVersionResponse
     */
    public CreateEdgeContainerAppVersionResponse createEdgeContainerAppVersion(CreateEdgeContainerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEdgeContainerAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add HTTP Request Header Rule</p>
     * 
     * @param tmpReq CreateHttpRequestHeaderModificationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHttpRequestHeaderModificationRuleResponse
     */
    public CreateHttpRequestHeaderModificationRuleResponse createHttpRequestHeaderModificationRuleWithOptions(CreateHttpRequestHeaderModificationRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateHttpRequestHeaderModificationRuleShrinkRequest request = new CreateHttpRequestHeaderModificationRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.requestHeaderModification)) {
            request.requestHeaderModificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.requestHeaderModification, "RequestHeaderModification", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestHeaderModificationShrink)) {
            query.put("RequestHeaderModification", request.requestHeaderModificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHttpRequestHeaderModificationRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHttpRequestHeaderModificationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add HTTP Request Header Rule</p>
     * 
     * @param request CreateHttpRequestHeaderModificationRuleRequest
     * @return CreateHttpRequestHeaderModificationRuleResponse
     */
    public CreateHttpRequestHeaderModificationRuleResponse createHttpRequestHeaderModificationRule(CreateHttpRequestHeaderModificationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHttpRequestHeaderModificationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add HTTP Response Header Rule</p>
     * 
     * @param tmpReq CreateHttpResponseHeaderModificationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHttpResponseHeaderModificationRuleResponse
     */
    public CreateHttpResponseHeaderModificationRuleResponse createHttpResponseHeaderModificationRuleWithOptions(CreateHttpResponseHeaderModificationRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateHttpResponseHeaderModificationRuleShrinkRequest request = new CreateHttpResponseHeaderModificationRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.responseHeaderModification)) {
            request.responseHeaderModificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.responseHeaderModification, "ResponseHeaderModification", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.responseHeaderModificationShrink)) {
            query.put("ResponseHeaderModification", request.responseHeaderModificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHttpResponseHeaderModificationRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHttpResponseHeaderModificationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add HTTP Response Header Rule</p>
     * 
     * @param request CreateHttpResponseHeaderModificationRuleRequest
     * @return CreateHttpResponseHeaderModificationRuleResponse
     */
    public CreateHttpResponseHeaderModificationRuleResponse createHttpResponseHeaderModificationRule(CreateHttpResponseHeaderModificationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHttpResponseHeaderModificationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new site HTTPS application configuration</p>
     * 
     * @param request CreateHttpsApplicationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHttpsApplicationConfigurationResponse
     */
    public CreateHttpsApplicationConfigurationResponse createHttpsApplicationConfigurationWithOptions(CreateHttpsApplicationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.altSvc)) {
            query.put("AltSvc", request.altSvc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.altSvcClear)) {
            query.put("AltSvcClear", request.altSvcClear);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.altSvcMa)) {
            query.put("AltSvcMa", request.altSvcMa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.altSvcPersist)) {
            query.put("AltSvcPersist", request.altSvcPersist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hsts)) {
            query.put("Hsts", request.hsts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hstsIncludeSubdomains)) {
            query.put("HstsIncludeSubdomains", request.hstsIncludeSubdomains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hstsMaxAge)) {
            query.put("HstsMaxAge", request.hstsMaxAge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hstsPreload)) {
            query.put("HstsPreload", request.hstsPreload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsForce)) {
            query.put("HttpsForce", request.httpsForce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsForceCode)) {
            query.put("HttpsForceCode", request.httpsForceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsNoSniDeny)) {
            query.put("HttpsNoSniDeny", request.httpsNoSniDeny);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsSniVerify)) {
            query.put("HttpsSniVerify", request.httpsSniVerify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsSniWhitelist)) {
            query.put("HttpsSniWhitelist", request.httpsSniWhitelist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHttpsApplicationConfiguration"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHttpsApplicationConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new site HTTPS application configuration</p>
     * 
     * @param request CreateHttpsApplicationConfigurationRequest
     * @return CreateHttpsApplicationConfigurationResponse
     */
    public CreateHttpsApplicationConfigurationResponse createHttpsApplicationConfiguration(CreateHttpsApplicationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHttpsApplicationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new site HTTPS basic configuration</p>
     * 
     * @param request CreateHttpsBasicConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHttpsBasicConfigurationResponse
     */
    public CreateHttpsBasicConfigurationResponse createHttpsBasicConfigurationWithOptions(CreateHttpsBasicConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciphersuite)) {
            query.put("Ciphersuite", request.ciphersuite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ciphersuiteGroup)) {
            query.put("CiphersuiteGroup", request.ciphersuiteGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2)) {
            query.put("Http2", request.http2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http3)) {
            query.put("Http3", request.http3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.https)) {
            query.put("Https", request.https);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocspStapling)) {
            query.put("OcspStapling", request.ocspStapling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tls10)) {
            query.put("Tls10", request.tls10);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tls11)) {
            query.put("Tls11", request.tls11);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tls12)) {
            query.put("Tls12", request.tls12);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tls13)) {
            query.put("Tls13", request.tls13);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHttpsBasicConfiguration"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHttpsBasicConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new site HTTPS basic configuration</p>
     * 
     * @param request CreateHttpsBasicConfigurationRequest
     * @return CreateHttpsBasicConfigurationResponse
     */
    public CreateHttpsBasicConfigurationResponse createHttpsBasicConfiguration(CreateHttpsBasicConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHttpsBasicConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add Site Image Transformation Configuration</p>
     * 
     * @param request CreateImageTransformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageTransformResponse
     */
    public CreateImageTransformResponse createImageTransformWithOptions(CreateImageTransformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageTransform"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageTransformResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add Site Image Transformation Configuration</p>
     * 
     * @param request CreateImageTransformRequest
     * @return CreateImageTransformResponse
     */
    public CreateImageTransformResponse createImageTransform(CreateImageTransformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageTransformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a namespace in your Alibaba Cloud account.</p>
     * 
     * @param request CreateKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKvNamespaceResponse
     */
    public CreateKvNamespaceResponse createKvNamespaceWithOptions(CreateKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKvNamespace"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKvNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a namespace in your Alibaba Cloud account.</p>
     * 
     * @param request CreateKvNamespaceRequest
     * @return CreateKvNamespaceResponse
     */
    public CreateKvNamespaceResponse createKvNamespace(CreateKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a list. Lists are used for the referencing of values in the rules engine to implement complex logic and control in security policies.</p>
     * 
     * @param tmpReq CreateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateListResponse
     */
    public CreateListResponse createListWithOptions(CreateListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateListShrinkRequest request = new CreateListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.items)) {
            request.itemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.items, "Items", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemsShrink)) {
            body.put("Items", request.itemsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kind)) {
            body.put("Kind", request.kind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a list. Lists are used for the referencing of values in the rules engine to implement complex logic and control in security policies.</p>
     * 
     * @param request CreateListRequest
     * @return CreateListResponse
     */
    public CreateListResponse createList(CreateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Through this API, users can configure load balancing services according to their business needs, including but not limited to adaptive routing, weighted round-robin, rule matching, health checks, and other settings, to achieve effective traffic management and optimization.</p>
     * 
     * <b>summary</b> : 
     * <p>Add a New Load Balancer</p>
     * 
     * @param tmpReq CreateLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancerWithOptions(CreateLoadBalancerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLoadBalancerShrinkRequest request = new CreateLoadBalancerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adaptiveRouting)) {
            request.adaptiveRoutingShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adaptiveRouting, "AdaptiveRouting", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.defaultPools)) {
            request.defaultPoolsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.defaultPools, "DefaultPools", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.monitor)) {
            request.monitorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.monitor, "Monitor", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.randomSteering)) {
            request.randomSteeringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.randomSteering, "RandomSteering", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adaptiveRoutingShrink)) {
            query.put("AdaptiveRouting", request.adaptiveRoutingShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultPoolsShrink)) {
            query.put("DefaultPools", request.defaultPoolsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallbackPool)) {
            query.put("FallbackPool", request.fallbackPool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorShrink)) {
            query.put("Monitor", request.monitorShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomSteeringShrink)) {
            query.put("RandomSteering", request.randomSteeringShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionPools)) {
            query.put("RegionPools", request.regionPools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            query.put("Rules", request.rulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionAffinity)) {
            query.put("SessionAffinity", request.sessionAffinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.steeringPolicy)) {
            query.put("SteeringPolicy", request.steeringPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subRegionPools)) {
            query.put("SubRegionPools", request.subRegionPools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancer"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Through this API, users can configure load balancing services according to their business needs, including but not limited to adaptive routing, weighted round-robin, rule matching, health checks, and other settings, to achieve effective traffic management and optimization.</p>
     * 
     * <b>summary</b> : 
     * <p>Add a New Load Balancer</p>
     * 
     * @param request CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new site network optimization configuration</p>
     * 
     * @param request CreateNetworkOptimizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkOptimizationResponse
     */
    public CreateNetworkOptimizationResponse createNetworkOptimizationWithOptions(CreateNetworkOptimizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.grpc)) {
            query.put("Grpc", request.grpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2Origin)) {
            query.put("Http2Origin", request.http2Origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartRouting)) {
            query.put("SmartRouting", request.smartRouting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadMaxFilesize)) {
            query.put("UploadMaxFilesize", request.uploadMaxFilesize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.websocket)) {
            query.put("Websocket", request.websocket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkOptimization"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkOptimizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new site network optimization configuration</p>
     * 
     * @param request CreateNetworkOptimizationRequest
     * @return CreateNetworkOptimizationResponse
     */
    public CreateNetworkOptimizationResponse createNetworkOptimization(CreateNetworkOptimizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkOptimizationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Multiple origins can be added under the origin address, supporting domain names, IPs, OSS, S3, and other types of origins. It supports authentication for OSS and S3 type origins.</p>
     * 
     * <b>summary</b> : 
     * <p>Add a new origin address pool</p>
     * 
     * @param tmpReq CreateOriginPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOriginPoolResponse
     */
    public CreateOriginPoolResponse createOriginPoolWithOptions(CreateOriginPoolRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOriginPoolShrinkRequest request = new CreateOriginPoolShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.origins)) {
            request.originsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.origins, "Origins", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originsShrink)) {
            query.put("Origins", request.originsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOriginPool"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOriginPoolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Multiple origins can be added under the origin address, supporting domain names, IPs, OSS, S3, and other types of origins. It supports authentication for OSS and S3 type origins.</p>
     * 
     * <b>summary</b> : 
     * <p>Add a new origin address pool</p>
     * 
     * @param request CreateOriginPoolRequest
     * @return CreateOriginPoolResponse
     */
    public CreateOriginPoolResponse createOriginPool(CreateOriginPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOriginPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables origin protection.</p>
     * 
     * @param request CreateOriginProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOriginProtectionResponse
     */
    public CreateOriginProtectionResponse createOriginProtectionWithOptions(CreateOriginProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOriginProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOriginProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables origin protection.</p>
     * 
     * @param request CreateOriginProtectionRequest
     * @return CreateOriginProtectionResponse
     */
    public CreateOriginProtectionResponse createOriginProtection(CreateOriginProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOriginProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new origin rule configuration for the site</p>
     * 
     * @param request CreateOriginRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOriginRuleResponse
     */
    public CreateOriginRuleResponse createOriginRuleWithOptions(CreateOriginRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dnsRecord)) {
            query.put("DnsRecord", request.dnsRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow302Enable)) {
            query.put("Follow302Enable", request.follow302Enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow302MaxTries)) {
            query.put("Follow302MaxTries", request.follow302MaxTries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow302RetainArgs)) {
            query.put("Follow302RetainArgs", request.follow302RetainArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow302RetainHeader)) {
            query.put("Follow302RetainHeader", request.follow302RetainHeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow302TargetHost)) {
            query.put("Follow302TargetHost", request.follow302TargetHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originHost)) {
            query.put("OriginHost", request.originHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originHttpPort)) {
            query.put("OriginHttpPort", request.originHttpPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originHttpsPort)) {
            query.put("OriginHttpsPort", request.originHttpsPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originMtls)) {
            query.put("OriginMtls", request.originMtls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originReadTimeout)) {
            query.put("OriginReadTimeout", request.originReadTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originScheme)) {
            query.put("OriginScheme", request.originScheme);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originSni)) {
            query.put("OriginSni", request.originSni);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originVerify)) {
            query.put("OriginVerify", request.originVerify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.range)) {
            query.put("Range", request.range);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rangeChunkSize)) {
            query.put("RangeChunkSize", request.rangeChunkSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOriginRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOriginRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new origin rule configuration for the site</p>
     * 
     * @param request CreateOriginRuleRequest
     * @return CreateOriginRuleResponse
     */
    public CreateOriginRuleResponse createOriginRule(CreateOriginRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOriginRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom error page, which is displayed when a request is blocked by Web Application Firewall (WAF). You can configure the HTML content, page type, and description, and submit the Base64-encoded page content.</p>
     * 
     * @param request CreatePageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePageResponse
     */
    public CreatePageResponse createPageWithOptions(CreatePageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom error page, which is displayed when a request is blocked by Web Application Firewall (WAF). You can configure the HTML content, page type, and description, and submit the Base64-encoded page content.</p>
     * 
     * @param request CreatePageRequest
     * @return CreatePageResponse
     */
    public CreatePageResponse createPage(CreatePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a DNS record for a specific website.</p>
     * 
     * @param tmpReq CreateRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecordResponse
     */
    public CreateRecordResponse createRecordWithOptions(CreateRecordRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRecordShrinkRequest request = new CreateRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authConf)) {
            request.authConfShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authConf, "AuthConf", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authConfShrink)) {
            query.put("AuthConf", request.authConfShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            query.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            query.put("Data", request.dataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostPolicy)) {
            query.put("HostPolicy", request.hostPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxied)) {
            query.put("Proxied", request.proxied);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            query.put("RecordName", request.recordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a DNS record for a specific website.</p>
     * 
     * @param request CreateRecordRequest
     * @return CreateRecordResponse
     */
    public CreateRecordResponse createRecord(CreateRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add a Redirect Rule</p>
     * 
     * @param request CreateRedirectRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRedirectRuleResponse
     */
    public CreateRedirectRuleResponse createRedirectRuleWithOptions(CreateRedirectRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reserveQueryString)) {
            query.put("ReserveQueryString", request.reserveQueryString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusCode)) {
            query.put("StatusCode", request.statusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUrl)) {
            query.put("TargetUrl", request.targetUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRedirectRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRedirectRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add a Redirect Rule</p>
     * 
     * @param request CreateRedirectRuleRequest
     * @return CreateRedirectRuleResponse
     */
    public CreateRedirectRuleResponse createRedirectRule(CreateRedirectRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRedirectRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add Rewrite URL Rule</p>
     * 
     * @param request CreateRewriteUrlRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRewriteUrlRuleResponse
     */
    public CreateRewriteUrlRuleResponse createRewriteUrlRuleWithOptions(CreateRewriteUrlRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryString)) {
            query.put("QueryString", request.queryString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rewriteQueryStringType)) {
            query.put("RewriteQueryStringType", request.rewriteQueryStringType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rewriteUriType)) {
            query.put("RewriteUriType", request.rewriteUriType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            query.put("Uri", request.uri);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRewriteUrlRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRewriteUrlRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add Rewrite URL Rule</p>
     * 
     * @param request CreateRewriteUrlRuleRequest
     * @return CreateRewriteUrlRuleResponse
     */
    public CreateRewriteUrlRuleResponse createRewriteUrlRule(CreateRewriteUrlRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRewriteUrlRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a routine.</p>
     * 
     * @param request CreateRoutineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoutineResponse
     */
    public CreateRoutineResponse createRoutineWithOptions(CreateRoutineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoutine"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoutineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a routine.</p>
     * 
     * @param request CreateRoutineRequest
     * @return CreateRoutineResponse
     */
    public CreateRoutineResponse createRoutine(CreateRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoutineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a record to map a domain that is associated with a routine. This record is used to trigger the associated routine code.</p>
     * 
     * @param request CreateRoutineRelatedRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoutineRelatedRecordResponse
     */
    public CreateRoutineRelatedRecordResponse createRoutineRelatedRecordWithOptions(CreateRoutineRelatedRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            body.put("RecordName", request.recordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoutineRelatedRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoutineRelatedRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a record to map a domain that is associated with a routine. This record is used to trigger the associated routine code.</p>
     * 
     * @param request CreateRoutineRelatedRecordRequest
     * @return CreateRoutineRelatedRecordResponse
     */
    public CreateRoutineRelatedRecordResponse createRoutineRelatedRecord(CreateRoutineRelatedRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoutineRelatedRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增边缘函数路由配置</p>
     * 
     * @param request CreateRoutineRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoutineRouteResponse
     */
    public CreateRoutineRouteResponse createRoutineRouteWithOptions(CreateRoutineRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bypass)) {
            query.put("Bypass", request.bypass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeEnable)) {
            query.put("RouteEnable", request.routeEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routineName)) {
            query.put("RoutineName", request.routineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoutineRoute"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoutineRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增边缘函数路由配置</p>
     * 
     * @param request CreateRoutineRouteRequest
     * @return CreateRoutineRouteResponse
     */
    public CreateRoutineRouteResponse createRoutineRoute(CreateRoutineRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoutineRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates scheduled prefetch plans.</p>
     * 
     * @param tmpReq CreateScheduledPreloadExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledPreloadExecutionsResponse
     */
    public CreateScheduledPreloadExecutionsResponse createScheduledPreloadExecutionsWithOptions(CreateScheduledPreloadExecutionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScheduledPreloadExecutionsShrinkRequest request = new CreateScheduledPreloadExecutionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executions)) {
            request.executionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executions, "Executions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionsShrink)) {
            body.put("Executions", request.executionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledPreloadExecutions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledPreloadExecutionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates scheduled prefetch plans.</p>
     * 
     * @param request CreateScheduledPreloadExecutionsRequest
     * @return CreateScheduledPreloadExecutionsResponse
     */
    public CreateScheduledPreloadExecutionsResponse createScheduledPreloadExecutions(CreateScheduledPreloadExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduledPreloadExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a scheduled prefetch task.</p>
     * 
     * @param request CreateScheduledPreloadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledPreloadJobResponse
     */
    public CreateScheduledPreloadJobResponse createScheduledPreloadJobWithOptions(CreateScheduledPreloadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.insertWay)) {
            body.put("InsertWay", request.insertWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossUrl)) {
            body.put("OssUrl", request.ossUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlList)) {
            body.put("UrlList", request.urlList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledPreloadJob"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledPreloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a scheduled prefetch task.</p>
     * 
     * @param request CreateScheduledPreloadJobRequest
     * @return CreateScheduledPreloadJobResponse
     */
    public CreateScheduledPreloadJobResponse createScheduledPreloadJob(CreateScheduledPreloadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduledPreloadJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Make sure that you have an available plan before you add a website.</p>
     * <ul>
     * <li>Make sure that your website domain name has an ICP filing if the location you want to specify covers the Chinese mainland.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a website.</p>
     * 
     * @param request CreateSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSiteResponse
     */
    public CreateSiteResponse createSiteWithOptions(CreateSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            query.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverage)) {
            query.put("Coverage", request.coverage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteName)) {
            query.put("SiteName", request.siteName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSite"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSiteResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Make sure that you have an available plan before you add a website.</p>
     * <ul>
     * <li>Make sure that your website domain name has an ICP filing if the location you want to specify covers the Chinese mainland.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a website.</p>
     * 
     * @param request CreateSiteRequest
     * @return CreateSiteResponse
     */
    public CreateSiteResponse createSite(CreateSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSiteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Custom field limits</strong>: The key name of a custom field can contain only letters, digits, underscores (_), and spaces. The key name cannot contain other characters. Otherwise, errors may occur.</p>
     * <ul>
     * <li><strong>Parameter passing</strong>: Submit <code>SiteId</code>, <code>RequestHeaders</code>, <code>ResponseHeaders</code>, and <code>Cookies</code> by using <code>formData</code>. Each array element matches a custom field name.</li>
     * <li><strong>(Required) SiteId</strong>: Although <code>SiteId</code> is not marked as required in the Required column, you must specify a website ID by using this parameter when you can call this API operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds the configuration of custom request header, response header, and cookie fields that are used to capture logs of a website.</p>
     * 
     * @param tmpReq CreateSiteCustomLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSiteCustomLogResponse
     */
    public CreateSiteCustomLogResponse createSiteCustomLogWithOptions(CreateSiteCustomLogRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSiteCustomLogShrinkRequest request = new CreateSiteCustomLogShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cookies)) {
            request.cookiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cookies, "Cookies", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.requestHeaders)) {
            request.requestHeadersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.requestHeaders, "RequestHeaders", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.responseHeaders)) {
            request.responseHeadersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.responseHeaders, "ResponseHeaders", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cookiesShrink)) {
            body.put("Cookies", request.cookiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestHeadersShrink)) {
            body.put("RequestHeaders", request.requestHeadersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseHeadersShrink)) {
            body.put("ResponseHeaders", request.responseHeadersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSiteCustomLog"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSiteCustomLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Custom field limits</strong>: The key name of a custom field can contain only letters, digits, underscores (_), and spaces. The key name cannot contain other characters. Otherwise, errors may occur.</p>
     * <ul>
     * <li><strong>Parameter passing</strong>: Submit <code>SiteId</code>, <code>RequestHeaders</code>, <code>ResponseHeaders</code>, and <code>Cookies</code> by using <code>formData</code>. Each array element matches a custom field name.</li>
     * <li><strong>(Required) SiteId</strong>: Although <code>SiteId</code> is not marked as required in the Required column, you must specify a website ID by using this parameter when you can call this API operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds the configuration of custom request header, response header, and cookie fields that are used to capture logs of a website.</p>
     * 
     * @param request CreateSiteCustomLogRequest
     * @return CreateSiteCustomLogResponse
     */
    public CreateSiteCustomLogResponse createSiteCustomLog(CreateSiteCustomLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSiteCustomLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a real-time log delivery task.</p>
     * 
     * @param tmpReq CreateSiteDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSiteDeliveryTaskResponse
     */
    public CreateSiteDeliveryTaskResponse createSiteDeliveryTaskWithOptions(CreateSiteDeliveryTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSiteDeliveryTaskShrinkRequest request = new CreateSiteDeliveryTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.httpDelivery)) {
            request.httpDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.httpDelivery, "HttpDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kafkaDelivery)) {
            request.kafkaDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kafkaDelivery, "KafkaDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ossDelivery)) {
            request.ossDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ossDelivery, "OssDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.s3Delivery)) {
            request.s3DeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.s3Delivery, "S3Delivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.slsDelivery)) {
            request.slsDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.slsDelivery, "SlsDelivery", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCenter)) {
            body.put("DataCenter", request.dataCenter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            body.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discardRate)) {
            body.put("DiscardRate", request.discardRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            body.put("FieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpDeliveryShrink)) {
            body.put("HttpDelivery", request.httpDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaDeliveryShrink)) {
            body.put("KafkaDelivery", request.kafkaDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossDeliveryShrink)) {
            body.put("OssDelivery", request.ossDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.s3DeliveryShrink)) {
            body.put("S3Delivery", request.s3DeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsDeliveryShrink)) {
            body.put("SlsDelivery", request.slsDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSiteDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSiteDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a real-time log delivery task.</p>
     * 
     * @param request CreateSiteDeliveryTaskRequest
     * @return CreateSiteDeliveryTaskResponse
     */
    public CreateSiteDeliveryTaskResponse createSiteDeliveryTask(CreateSiteDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSiteDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个实时日志slr角色</p>
     * 
     * @param request CreateSlrRoleForRealtimeLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSlrRoleForRealtimeLogResponse
     */
    public CreateSlrRoleForRealtimeLogResponse createSlrRoleForRealtimeLogWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSlrRoleForRealtimeLog"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSlrRoleForRealtimeLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个实时日志slr角色</p>
     * @return CreateSlrRoleForRealtimeLogResponse
     */
    public CreateSlrRoleForRealtimeLogResponse createSlrRoleForRealtimeLog() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSlrRoleForRealtimeLogWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation allows you to deliver logs to destinations such as Simple Log Service (SLS), HTTP servers, Object Storage Service (OSS), Amazon Simple Storage Service (S3), and Kafka. You can specify the task name, log fields to deliver, data center, discard rate, delivery type, and delivery details.</p>
     * <ul>
     * <li><strong>Field filtering</strong>: Use the <code>FieldName</code> parameter to specify log fields to deliver.</li>
     * <li><strong>Filtering rules</strong>: Use the <code>FilterRules</code> parameter to pre-process and filter log data.</li>
     * <li><strong>Diverse delivery destinations</strong>: Logs can be delivered to different destinations. Configuration parameters vary with delivery destinations.</li>
     * </ul>
     * <h2><a href="#"></a>Precautions</h2>
     * <ul>
     * <li>Make sure that you have sufficient permissions to perform delivery tasks.</li>
     * <li>If you enable encryption or authentication, properly configure corresponding parameters.</li>
     * <li>Verify the syntax of <code>FilterRules</code> to make sure that filtering logic works as expected.</li>
     * <li>Specify advanced settings such as the number of retries and timeout period based on your needs to have optimal delivery efficiency and stability.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a log delivery task to ship logs to the specified destination.</p>
     * 
     * @param tmpReq CreateUserDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserDeliveryTaskResponse
     */
    public CreateUserDeliveryTaskResponse createUserDeliveryTaskWithOptions(CreateUserDeliveryTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUserDeliveryTaskShrinkRequest request = new CreateUserDeliveryTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.httpDelivery)) {
            request.httpDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.httpDelivery, "HttpDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kafkaDelivery)) {
            request.kafkaDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kafkaDelivery, "KafkaDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ossDelivery)) {
            request.ossDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ossDelivery, "OssDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.s3Delivery)) {
            request.s3DeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.s3Delivery, "S3Delivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.slsDelivery)) {
            request.slsDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.slsDelivery, "SlsDelivery", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCenter)) {
            body.put("DataCenter", request.dataCenter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            body.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.details)) {
            body.put("Details", request.details);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discardRate)) {
            body.put("DiscardRate", request.discardRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            body.put("FieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpDeliveryShrink)) {
            body.put("HttpDelivery", request.httpDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaDeliveryShrink)) {
            body.put("KafkaDelivery", request.kafkaDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossDeliveryShrink)) {
            body.put("OssDelivery", request.ossDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.s3DeliveryShrink)) {
            body.put("S3Delivery", request.s3DeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsDeliveryShrink)) {
            body.put("SlsDelivery", request.slsDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserDeliveryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation allows you to deliver logs to destinations such as Simple Log Service (SLS), HTTP servers, Object Storage Service (OSS), Amazon Simple Storage Service (S3), and Kafka. You can specify the task name, log fields to deliver, data center, discard rate, delivery type, and delivery details.</p>
     * <ul>
     * <li><strong>Field filtering</strong>: Use the <code>FieldName</code> parameter to specify log fields to deliver.</li>
     * <li><strong>Filtering rules</strong>: Use the <code>FilterRules</code> parameter to pre-process and filter log data.</li>
     * <li><strong>Diverse delivery destinations</strong>: Logs can be delivered to different destinations. Configuration parameters vary with delivery destinations.</li>
     * </ul>
     * <h2><a href="#"></a>Precautions</h2>
     * <ul>
     * <li>Make sure that you have sufficient permissions to perform delivery tasks.</li>
     * <li>If you enable encryption or authentication, properly configure corresponding parameters.</li>
     * <li>Verify the syntax of <code>FilterRules</code> to make sure that filtering logic works as expected.</li>
     * <li>Specify advanced settings such as the number of retries and timeout period based on your needs to have optimal delivery efficiency and stability.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a log delivery task to ship logs to the specified destination.</p>
     * 
     * @param request CreateUserDeliveryTaskRequest
     * @return CreateUserDeliveryTaskResponse
     */
    public CreateUserDeliveryTaskResponse createUserDeliveryTask(CreateUserDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增站点视频处理配置</p>
     * 
     * @param request CreateVideoProcessingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVideoProcessingResponse
     */
    public CreateVideoProcessingResponse createVideoProcessingWithOptions(CreateVideoProcessingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flvSeekEnd)) {
            query.put("FlvSeekEnd", request.flvSeekEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flvSeekStart)) {
            query.put("FlvSeekStart", request.flvSeekStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flvVideoSeekMode)) {
            query.put("FlvVideoSeekMode", request.flvVideoSeekMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mp4SeekEnd)) {
            query.put("Mp4SeekEnd", request.mp4SeekEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mp4SeekStart)) {
            query.put("Mp4SeekStart", request.mp4SeekStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoSeekEnable)) {
            query.put("VideoSeekEnable", request.videoSeekEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoProcessing"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoProcessingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增站点视频处理配置</p>
     * 
     * @param request CreateVideoProcessingRequest
     * @return CreateVideoProcessingResponse
     */
    public CreateVideoProcessingResponse createVideoProcessing(CreateVideoProcessingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoProcessingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create WAF Rule</p>
     * 
     * @param tmpReq CreateWafRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWafRuleResponse
     */
    public CreateWafRuleResponse createWafRuleWithOptions(CreateWafRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWafRuleShrinkRequest request = new CreateWafRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.config)) {
            request.configShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.config, "Config", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configShrink)) {
            body.put("Config", request.configShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesetId)) {
            body.put("RulesetId", request.rulesetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWafRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWafRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create WAF Rule</p>
     * 
     * @param request CreateWafRuleRequest
     * @return CreateWafRuleResponse
     */
    public CreateWafRuleResponse createWafRule(CreateWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWafRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create WAF Ruleset</p>
     * 
     * @param request CreateWafRulesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWafRulesetResponse
     */
    public CreateWafRulesetResponse createWafRulesetWithOptions(CreateWafRulesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWafRuleset"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWafRulesetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create WAF Ruleset</p>
     * 
     * @param request CreateWafRulesetRequest
     * @return CreateWafRulesetResponse
     */
    public CreateWafRulesetResponse createWafRuleset(CreateWafRulesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWafRulesetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a waiting room for a website.</p>
     * 
     * @param tmpReq CreateWaitingRoomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWaitingRoomResponse
     */
    public CreateWaitingRoomResponse createWaitingRoomWithOptions(CreateWaitingRoomRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWaitingRoomShrinkRequest request = new CreateWaitingRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hostNameAndPath)) {
            request.hostNameAndPathShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hostNameAndPath, "HostNameAndPath", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cookieName)) {
            query.put("CookieName", request.cookieName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPageHtml)) {
            query.put("CustomPageHtml", request.customPageHtml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSessionRenewalEnable)) {
            query.put("DisableSessionRenewalEnable", request.disableSessionRenewalEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostNameAndPathShrink)) {
            query.put("HostNameAndPath", request.hostNameAndPathShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonResponseEnable)) {
            query.put("JsonResponseEnable", request.jsonResponseEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newUsersPerMinute)) {
            query.put("NewUsersPerMinute", request.newUsersPerMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueAllEnable)) {
            query.put("QueueAllEnable", request.queueAllEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingMethod)) {
            query.put("QueuingMethod", request.queuingMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingStatusCode)) {
            query.put("QueuingStatusCode", request.queuingStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionDuration)) {
            query.put("SessionDuration", request.sessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalActiveUsers)) {
            query.put("TotalActiveUsers", request.totalActiveUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomType)) {
            query.put("WaitingRoomType", request.waitingRoomType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWaitingRoom"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWaitingRoomResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a waiting room for a website.</p>
     * 
     * @param request CreateWaitingRoomRequest
     * @return CreateWaitingRoomResponse
     */
    public CreateWaitingRoomResponse createWaitingRoom(CreateWaitingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWaitingRoomWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a waiting room event.</p>
     * 
     * @param request CreateWaitingRoomEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWaitingRoomEventResponse
     */
    public CreateWaitingRoomEventResponse createWaitingRoomEventWithOptions(CreateWaitingRoomEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPageHtml)) {
            query.put("CustomPageHtml", request.customPageHtml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSessionRenewalEnable)) {
            query.put("DisableSessionRenewalEnable", request.disableSessionRenewalEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonResponseEnable)) {
            query.put("JsonResponseEnable", request.jsonResponseEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newUsersPerMinute)) {
            query.put("NewUsersPerMinute", request.newUsersPerMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preQueueEnable)) {
            query.put("PreQueueEnable", request.preQueueEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preQueueStartTime)) {
            query.put("PreQueueStartTime", request.preQueueStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingMethod)) {
            query.put("QueuingMethod", request.queuingMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingStatusCode)) {
            query.put("QueuingStatusCode", request.queuingStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomPreQueueEnable)) {
            query.put("RandomPreQueueEnable", request.randomPreQueueEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionDuration)) {
            query.put("SessionDuration", request.sessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalActiveUsers)) {
            query.put("TotalActiveUsers", request.totalActiveUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomId)) {
            query.put("WaitingRoomId", request.waitingRoomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomType)) {
            query.put("WaitingRoomType", request.waitingRoomType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWaitingRoomEvent"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWaitingRoomEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a waiting room event.</p>
     * 
     * @param request CreateWaitingRoomEventRequest
     * @return CreateWaitingRoomEventResponse
     */
    public CreateWaitingRoomEventResponse createWaitingRoomEvent(CreateWaitingRoomEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWaitingRoomEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Waiting Room Rule</p>
     * 
     * @param request CreateWaitingRoomRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWaitingRoomRuleResponse
     */
    public CreateWaitingRoomRuleResponse createWaitingRoomRuleWithOptions(CreateWaitingRoomRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomId)) {
            query.put("WaitingRoomId", request.waitingRoomId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWaitingRoomRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWaitingRoomRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Waiting Room Rule</p>
     * 
     * @param request CreateWaitingRoomRuleRequest
     * @return CreateWaitingRoomRuleResponse
     */
    public CreateWaitingRoomRuleResponse createWaitingRoomRule(CreateWaitingRoomRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWaitingRoomRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can disable version management only when the default environment and version 0 exist.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables version management for a website.</p>
     * 
     * @param request DeactivateVersionManagementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeactivateVersionManagementResponse
     */
    public DeactivateVersionManagementResponse deactivateVersionManagementWithOptions(DeactivateVersionManagementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeactivateVersionManagement"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactivateVersionManagementResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can disable version management only when the default environment and version 0 exist.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables version management for a website.</p>
     * 
     * @param request DeactivateVersionManagementRequest
     * @return DeactivateVersionManagementResponse
     */
    public DeactivateVersionManagementResponse deactivateVersionManagement(DeactivateVersionManagementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactivateVersionManagementWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Cache Configuration</p>
     * 
     * @param request DeleteCacheRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCacheRuleResponse
     */
    public DeleteCacheRuleResponse deleteCacheRuleWithOptions(DeleteCacheRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCacheRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCacheRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Cache Configuration</p>
     * 
     * @param request DeleteCacheRuleRequest
     * @return DeleteCacheRuleResponse
     */
    public DeleteCacheRuleResponse deleteCacheRule(DeleteCacheRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCacheRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a certificate for a website.</p>
     * 
     * @param request DeleteCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificateWithOptions(DeleteCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a certificate for a website.</p>
     * 
     * @param request DeleteCertificateRequest
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a client CA certificate.</p>
     * 
     * @param request DeleteClientCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientCaCertificateResponse
     */
    public DeleteClientCaCertificateResponse deleteClientCaCertificateWithOptions(DeleteClientCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientCaCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a client CA certificate.</p>
     * 
     * @param request DeleteClientCaCertificateRequest
     * @return DeleteClientCaCertificateResponse
     */
    public DeleteClientCaCertificateResponse deleteClientCaCertificate(DeleteClientCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a revoked client certificate.</p>
     * 
     * @param request DeleteClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientCertificateResponse
     */
    public DeleteClientCertificateResponse deleteClientCertificateWithOptions(DeleteClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a revoked client certificate.</p>
     * 
     * @param request DeleteClientCertificateRequest
     * @return DeleteClientCertificateResponse
     */
    public DeleteClientCertificateResponse deleteClientCertificate(DeleteClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete compression rule</p>
     * 
     * @param request DeleteCompressionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCompressionRuleResponse
     */
    public DeleteCompressionRuleResponse deleteCompressionRuleWithOptions(DeleteCompressionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCompressionRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCompressionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete compression rule</p>
     * 
     * @param request DeleteCompressionRuleRequest
     * @return DeleteCompressionRuleResponse
     */
    public DeleteCompressionRuleResponse deleteCompressionRule(DeleteCompressionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCompressionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scenario-specific custom policy.</p>
     * 
     * @param request DeleteCustomScenePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomScenePolicyResponse
     */
    public DeleteCustomScenePolicyResponse deleteCustomScenePolicyWithOptions(DeleteCustomScenePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomScenePolicy"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomScenePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scenario-specific custom policy.</p>
     * 
     * @param request DeleteCustomScenePolicyRequest
     * @return DeleteCustomScenePolicyResponse
     */
    public DeleteCustomScenePolicyResponse deleteCustomScenePolicy(DeleteCustomScenePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomScenePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a containerized application.</p>
     * 
     * @param request DeleteEdgeContainerAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEdgeContainerAppResponse
     */
    public DeleteEdgeContainerAppResponse deleteEdgeContainerAppWithOptions(DeleteEdgeContainerAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeContainerApp"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeContainerAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a containerized application.</p>
     * 
     * @param request DeleteEdgeContainerAppRequest
     * @return DeleteEdgeContainerAppResponse
     */
    public DeleteEdgeContainerAppResponse deleteEdgeContainerApp(DeleteEdgeContainerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEdgeContainerAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a domain name from a containerized application. After the dissociation, you can no longer use the domain name to access the containerized application.</p>
     * 
     * @param request DeleteEdgeContainerAppRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEdgeContainerAppRecordResponse
     */
    public DeleteEdgeContainerAppRecordResponse deleteEdgeContainerAppRecordWithOptions(DeleteEdgeContainerAppRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            body.put("RecordName", request.recordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeContainerAppRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeContainerAppRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a domain name from a containerized application. After the dissociation, you can no longer use the domain name to access the containerized application.</p>
     * 
     * @param request DeleteEdgeContainerAppRecordRequest
     * @return DeleteEdgeContainerAppRecordResponse
     */
    public DeleteEdgeContainerAppRecordResponse deleteEdgeContainerAppRecord(DeleteEdgeContainerAppRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEdgeContainerAppRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a version of a containerized application.</p>
     * 
     * @param request DeleteEdgeContainerAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEdgeContainerAppVersionResponse
     */
    public DeleteEdgeContainerAppVersionResponse deleteEdgeContainerAppVersionWithOptions(DeleteEdgeContainerAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeContainerAppVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeContainerAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a version of a containerized application.</p>
     * 
     * @param request DeleteEdgeContainerAppVersionRequest
     * @return DeleteEdgeContainerAppVersionResponse
     */
    public DeleteEdgeContainerAppVersionResponse deleteEdgeContainerAppVersion(DeleteEdgeContainerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEdgeContainerAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the configuration of modifying HTTP request headers for a website.</p>
     * 
     * @param request DeleteHttpRequestHeaderModificationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHttpRequestHeaderModificationRuleResponse
     */
    public DeleteHttpRequestHeaderModificationRuleResponse deleteHttpRequestHeaderModificationRuleWithOptions(DeleteHttpRequestHeaderModificationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHttpRequestHeaderModificationRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHttpRequestHeaderModificationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the configuration of modifying HTTP request headers for a website.</p>
     * 
     * @param request DeleteHttpRequestHeaderModificationRuleRequest
     * @return DeleteHttpRequestHeaderModificationRuleResponse
     */
    public DeleteHttpRequestHeaderModificationRuleResponse deleteHttpRequestHeaderModificationRule(DeleteHttpRequestHeaderModificationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHttpRequestHeaderModificationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the configuration of modifying HTTP response headers for a website.</p>
     * 
     * @param request DeleteHttpResponseHeaderModificationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHttpResponseHeaderModificationRuleResponse
     */
    public DeleteHttpResponseHeaderModificationRuleResponse deleteHttpResponseHeaderModificationRuleWithOptions(DeleteHttpResponseHeaderModificationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHttpResponseHeaderModificationRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHttpResponseHeaderModificationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the configuration of modifying HTTP response headers for a website.</p>
     * 
     * @param request DeleteHttpResponseHeaderModificationRuleRequest
     * @return DeleteHttpResponseHeaderModificationRuleResponse
     */
    public DeleteHttpResponseHeaderModificationRuleResponse deleteHttpResponseHeaderModificationRule(DeleteHttpResponseHeaderModificationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHttpResponseHeaderModificationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete HTTPS Application Configuration</p>
     * 
     * @param request DeleteHttpsApplicationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHttpsApplicationConfigurationResponse
     */
    public DeleteHttpsApplicationConfigurationResponse deleteHttpsApplicationConfigurationWithOptions(DeleteHttpsApplicationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHttpsApplicationConfiguration"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHttpsApplicationConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete HTTPS Application Configuration</p>
     * 
     * @param request DeleteHttpsApplicationConfigurationRequest
     * @return DeleteHttpsApplicationConfigurationResponse
     */
    public DeleteHttpsApplicationConfigurationResponse deleteHttpsApplicationConfiguration(DeleteHttpsApplicationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHttpsApplicationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete HTTPS Basic Configuration</p>
     * 
     * @param request DeleteHttpsBasicConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHttpsBasicConfigurationResponse
     */
    public DeleteHttpsBasicConfigurationResponse deleteHttpsBasicConfigurationWithOptions(DeleteHttpsBasicConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHttpsBasicConfiguration"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHttpsBasicConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete HTTPS Basic Configuration</p>
     * 
     * @param request DeleteHttpsBasicConfigurationRequest
     * @return DeleteHttpsBasicConfigurationResponse
     */
    public DeleteHttpsBasicConfigurationResponse deleteHttpsBasicConfiguration(DeleteHttpsBasicConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHttpsBasicConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Site Image Transformation Configuration</p>
     * 
     * @param request DeleteImageTransformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImageTransformResponse
     */
    public DeleteImageTransformResponse deleteImageTransformWithOptions(DeleteImageTransformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImageTransform"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageTransformResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Site Image Transformation Configuration</p>
     * 
     * @param request DeleteImageTransformRequest
     * @return DeleteImageTransformResponse
     */
    public DeleteImageTransformResponse deleteImageTransform(DeleteImageTransformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageTransformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a key-value pair from a namespace.</p>
     * 
     * @param request DeleteKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKvResponse
     */
    public DeleteKvResponse deleteKvWithOptions(DeleteKvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a key-value pair from a namespace.</p>
     * 
     * @param request DeleteKvRequest
     * @return DeleteKvResponse
     */
    public DeleteKvResponse deleteKv(DeleteKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a namespace from an Alibaba Cloud account.</p>
     * 
     * @param request DeleteKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKvNamespaceResponse
     */
    public DeleteKvNamespaceResponse deleteKvNamespaceWithOptions(DeleteKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKvNamespace"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKvNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a namespace from an Alibaba Cloud account.</p>
     * 
     * @param request DeleteKvNamespaceRequest
     * @return DeleteKvNamespaceResponse
     */
    public DeleteKvNamespaceResponse deleteKvNamespace(DeleteKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom list that is no longer needed.</p>
     * 
     * @param request DeleteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteListResponse
     */
    public DeleteListResponse deleteListWithOptions(DeleteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom list that is no longer needed.</p>
     * 
     * @param request DeleteListRequest
     * @return DeleteListResponse
     */
    public DeleteListResponse deleteList(DeleteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Delete a load balancer by its ID, only one can be deleted at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Load Balancer</p>
     * 
     * @param request DeleteLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancerWithOptions(DeleteLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLoadBalancer"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLoadBalancerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Delete a load balancer by its ID, only one can be deleted at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Load Balancer</p>
     * 
     * @param request DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLoadBalancerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Network Optimization Configuration</p>
     * 
     * @param request DeleteNetworkOptimizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkOptimizationResponse
     */
    public DeleteNetworkOptimizationResponse deleteNetworkOptimizationWithOptions(DeleteNetworkOptimizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkOptimization"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkOptimizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Network Optimization Configuration</p>
     * 
     * @param request DeleteNetworkOptimizationRequest
     * @return DeleteNetworkOptimizationResponse
     */
    public DeleteNetworkOptimizationResponse deleteNetworkOptimization(DeleteNetworkOptimizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkOptimizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除源服务器CA证书</p>
     * 
     * @param request DeleteOriginCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOriginCaCertificateResponse
     */
    public DeleteOriginCaCertificateResponse deleteOriginCaCertificateWithOptions(DeleteOriginCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOriginCaCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOriginCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除源服务器CA证书</p>
     * 
     * @param request DeleteOriginCaCertificateRequest
     * @return DeleteOriginCaCertificateResponse
     */
    public DeleteOriginCaCertificateResponse deleteOriginCaCertificate(DeleteOriginCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOriginCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除域名回源客户端证书</p>
     * 
     * @param request DeleteOriginClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOriginClientCertificateResponse
     */
    public DeleteOriginClientCertificateResponse deleteOriginClientCertificateWithOptions(DeleteOriginClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOriginClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOriginClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除域名回源客户端证书</p>
     * 
     * @param request DeleteOriginClientCertificateRequest
     * @return DeleteOriginClientCertificateResponse
     */
    public DeleteOriginClientCertificateResponse deleteOriginClientCertificate(DeleteOriginClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOriginClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Origin Address Pool</p>
     * 
     * @param request DeleteOriginPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOriginPoolResponse
     */
    public DeleteOriginPoolResponse deleteOriginPoolWithOptions(DeleteOriginPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOriginPool"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOriginPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Origin Address Pool</p>
     * 
     * @param request DeleteOriginPoolRequest
     * @return DeleteOriginPoolResponse
     */
    public DeleteOriginPoolResponse deleteOriginPool(DeleteOriginPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOriginPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables origin protection.</p>
     * 
     * @param request DeleteOriginProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOriginProtectionResponse
     */
    public DeleteOriginProtectionResponse deleteOriginProtectionWithOptions(DeleteOriginProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOriginProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOriginProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables origin protection.</p>
     * 
     * @param request DeleteOriginProtectionRequest
     * @return DeleteOriginProtectionResponse
     */
    public DeleteOriginProtectionResponse deleteOriginProtection(DeleteOriginProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOriginProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Origin Rule Configuration</p>
     * 
     * @param request DeleteOriginRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOriginRuleResponse
     */
    public DeleteOriginRuleResponse deleteOriginRuleWithOptions(DeleteOriginRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOriginRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOriginRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Origin Rule Configuration</p>
     * 
     * @param request DeleteOriginRuleRequest
     * @return DeleteOriginRuleResponse
     */
    public DeleteOriginRuleResponse deleteOriginRule(DeleteOriginRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOriginRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom error page that is no longer needed.</p>
     * 
     * @param request DeletePageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePageResponse
     */
    public DeletePageResponse deletePageWithOptions(DeletePageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom error page that is no longer needed.</p>
     * 
     * @param request DeletePageRequest
     * @return DeletePageResponse
     */
    public DeletePageResponse deletePage(DeletePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a DNS record of a website based on the specified RecordId.</p>
     * 
     * @param request DeleteRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecordResponse
     */
    public DeleteRecordResponse deleteRecordWithOptions(DeleteRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a DNS record of a website based on the specified RecordId.</p>
     * 
     * @param request DeleteRecordRequest
     * @return DeleteRecordResponse
     */
    public DeleteRecordResponse deleteRecord(DeleteRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a URL redirect rule for a website.</p>
     * 
     * @param request DeleteRedirectRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRedirectRuleResponse
     */
    public DeleteRedirectRuleResponse deleteRedirectRuleWithOptions(DeleteRedirectRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRedirectRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRedirectRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a URL redirect rule for a website.</p>
     * 
     * @param request DeleteRedirectRuleRequest
     * @return DeleteRedirectRuleResponse
     */
    public DeleteRedirectRuleResponse deleteRedirectRule(DeleteRedirectRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRedirectRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a URL rewrite rule for a website.</p>
     * 
     * @param request DeleteRewriteUrlRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRewriteUrlRuleResponse
     */
    public DeleteRewriteUrlRuleResponse deleteRewriteUrlRuleWithOptions(DeleteRewriteUrlRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRewriteUrlRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRewriteUrlRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a URL rewrite rule for a website.</p>
     * 
     * @param request DeleteRewriteUrlRuleRequest
     * @return DeleteRewriteUrlRuleResponse
     */
    public DeleteRewriteUrlRuleResponse deleteRewriteUrlRule(DeleteRewriteUrlRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRewriteUrlRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a routine in Edge Routine.</p>
     * 
     * @param request DeleteRoutineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoutineResponse
     */
    public DeleteRoutineResponse deleteRoutineWithOptions(DeleteRoutineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutine"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a routine in Edge Routine.</p>
     * 
     * @param request DeleteRoutineRequest
     * @return DeleteRoutineResponse
     */
    public DeleteRoutineResponse deleteRoutine(DeleteRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a code version of a routine.</p>
     * 
     * @param request DeleteRoutineCodeVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoutineCodeVersionResponse
     */
    public DeleteRoutineCodeVersionResponse deleteRoutineCodeVersionWithOptions(DeleteRoutineCodeVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeVersion)) {
            body.put("CodeVersion", request.codeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutineCodeVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineCodeVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a code version of a routine.</p>
     * 
     * @param request DeleteRoutineCodeVersionRequest
     * @return DeleteRoutineCodeVersionResponse
     */
    public DeleteRoutineCodeVersionResponse deleteRoutineCodeVersion(DeleteRoutineCodeVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineCodeVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a record that is associated with a routine.</p>
     * 
     * @param request DeleteRoutineRelatedRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoutineRelatedRecordResponse
     */
    public DeleteRoutineRelatedRecordResponse deleteRoutineRelatedRecordWithOptions(DeleteRoutineRelatedRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            body.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            body.put("RecordName", request.recordName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutineRelatedRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineRelatedRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a record that is associated with a routine.</p>
     * 
     * @param request DeleteRoutineRelatedRecordRequest
     * @return DeleteRoutineRelatedRecordResponse
     */
    public DeleteRoutineRelatedRecordResponse deleteRoutineRelatedRecord(DeleteRoutineRelatedRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineRelatedRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除边缘函数路由配置</p>
     * 
     * @param request DeleteRoutineRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoutineRouteResponse
     */
    public DeleteRoutineRouteResponse deleteRoutineRouteWithOptions(DeleteRoutineRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutineRoute"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除边缘函数路由配置</p>
     * 
     * @param request DeleteRoutineRouteRequest
     * @return DeleteRoutineRouteResponse
     */
    public DeleteRoutineRouteResponse deleteRoutineRoute(DeleteRoutineRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scheduled prefetch plan based on the plan ID.</p>
     * 
     * @param request DeleteScheduledPreloadExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduledPreloadExecutionResponse
     */
    public DeleteScheduledPreloadExecutionResponse deleteScheduledPreloadExecutionWithOptions(DeleteScheduledPreloadExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScheduledPreloadExecution"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduledPreloadExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scheduled prefetch plan based on the plan ID.</p>
     * 
     * @param request DeleteScheduledPreloadExecutionRequest
     * @return DeleteScheduledPreloadExecutionResponse
     */
    public DeleteScheduledPreloadExecutionResponse deleteScheduledPreloadExecution(DeleteScheduledPreloadExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScheduledPreloadExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified scheduled prefetch task based on the task ID.</p>
     * 
     * @param request DeleteScheduledPreloadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduledPreloadJobResponse
     */
    public DeleteScheduledPreloadJobResponse deleteScheduledPreloadJobWithOptions(DeleteScheduledPreloadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScheduledPreloadJob"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduledPreloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified scheduled prefetch task based on the task ID.</p>
     * 
     * @param request DeleteScheduledPreloadJobRequest
     * @return DeleteScheduledPreloadJobResponse
     */
    public DeleteScheduledPreloadJobResponse deleteScheduledPreloadJob(DeleteScheduledPreloadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScheduledPreloadJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a website based on the specified website ID.</p>
     * 
     * @param request DeleteSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSiteResponse
     */
    public DeleteSiteResponse deleteSiteWithOptions(DeleteSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSite"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSiteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a website based on the specified website ID.</p>
     * 
     * @param request DeleteSiteRequest
     * @return DeleteSiteResponse
     */
    public DeleteSiteResponse deleteSite(DeleteSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSiteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a real-time log delivery task.</p>
     * 
     * @param request DeleteSiteDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSiteDeliveryTaskResponse
     */
    public DeleteSiteDeliveryTaskResponse deleteSiteDeliveryTaskWithOptions(DeleteSiteDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSiteDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSiteDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a real-time log delivery task.</p>
     * 
     * @param request DeleteSiteDeliveryTaskRequest
     * @return DeleteSiteDeliveryTaskResponse
     */
    public DeleteSiteDeliveryTaskResponse deleteSiteDeliveryTask(DeleteSiteDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSiteDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除站点回源客户端证书</p>
     * 
     * @param request DeleteSiteOriginClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSiteOriginClientCertificateResponse
     */
    public DeleteSiteOriginClientCertificateResponse deleteSiteOriginClientCertificateWithOptions(DeleteSiteOriginClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSiteOriginClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSiteOriginClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除站点回源客户端证书</p>
     * 
     * @param request DeleteSiteOriginClientCertificateRequest
     * @return DeleteSiteOriginClientCertificateResponse
     */
    public DeleteSiteOriginClientCertificateResponse deleteSiteOriginClientCertificate(DeleteSiteOriginClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSiteOriginClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>*****&gt; </p>
     * <ul>
     * <li>Deleted tasks cannot be restored. Proceed with caution.</li>
     * <li>To call this operation, you must have an account that has the required permissions.</li>
     * <li>The returned <code>RequestId</code> value can be used to track the request processing progress and troubleshoot issues.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a log delivery task from your Alibaba Cloud account.</p>
     * 
     * @param request DeleteUserDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserDeliveryTaskResponse
     */
    public DeleteUserDeliveryTaskResponse deleteUserDeliveryTaskWithOptions(DeleteUserDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserDeliveryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>*****&gt; </p>
     * <ul>
     * <li>Deleted tasks cannot be restored. Proceed with caution.</li>
     * <li>To call this operation, you must have an account that has the required permissions.</li>
     * <li>The returned <code>RequestId</code> value can be used to track the request processing progress and troubleshoot issues.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a log delivery task from your Alibaba Cloud account.</p>
     * 
     * @param request DeleteUserDeliveryTaskRequest
     * @return DeleteUserDeliveryTaskResponse
     */
    public DeleteUserDeliveryTaskResponse deleteUserDeliveryTask(DeleteUserDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除站点视频处理配置</p>
     * 
     * @param request DeleteVideoProcessingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVideoProcessingResponse
     */
    public DeleteVideoProcessingResponse deleteVideoProcessingWithOptions(DeleteVideoProcessingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVideoProcessing"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVideoProcessingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除站点视频处理配置</p>
     * 
     * @param request DeleteVideoProcessingRequest
     * @return DeleteVideoProcessingResponse
     */
    public DeleteVideoProcessingResponse deleteVideoProcessing(DeleteVideoProcessingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVideoProcessingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete WAF Rule</p>
     * 
     * @param request DeleteWafRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWafRuleResponse
     */
    public DeleteWafRuleResponse deleteWafRuleWithOptions(DeleteWafRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWafRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWafRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete WAF Rule</p>
     * 
     * @param request DeleteWafRuleRequest
     * @return DeleteWafRuleResponse
     */
    public DeleteWafRuleResponse deleteWafRule(DeleteWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWafRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete WAF Ruleset</p>
     * 
     * @param request DeleteWafRulesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWafRulesetResponse
     */
    public DeleteWafRulesetResponse deleteWafRulesetWithOptions(DeleteWafRulesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWafRuleset"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWafRulesetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete WAF Ruleset</p>
     * 
     * @param request DeleteWafRulesetRequest
     * @return DeleteWafRulesetResponse
     */
    public DeleteWafRulesetResponse deleteWafRuleset(DeleteWafRulesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWafRulesetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a waiting room.</p>
     * 
     * @param request DeleteWaitingRoomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWaitingRoomResponse
     */
    public DeleteWaitingRoomResponse deleteWaitingRoomWithOptions(DeleteWaitingRoomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomId)) {
            query.put("WaitingRoomId", request.waitingRoomId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWaitingRoom"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWaitingRoomResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a waiting room.</p>
     * 
     * @param request DeleteWaitingRoomRequest
     * @return DeleteWaitingRoomResponse
     */
    public DeleteWaitingRoomResponse deleteWaitingRoom(DeleteWaitingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWaitingRoomWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a waiting room event.</p>
     * 
     * @param request DeleteWaitingRoomEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWaitingRoomEventResponse
     */
    public DeleteWaitingRoomEventResponse deleteWaitingRoomEventWithOptions(DeleteWaitingRoomEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomEventId)) {
            query.put("WaitingRoomEventId", request.waitingRoomEventId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWaitingRoomEvent"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWaitingRoomEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a waiting room event.</p>
     * 
     * @param request DeleteWaitingRoomEventRequest
     * @return DeleteWaitingRoomEventResponse
     */
    public DeleteWaitingRoomEventResponse deleteWaitingRoomEvent(DeleteWaitingRoomEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWaitingRoomEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a waiting room bypass rule.</p>
     * 
     * @param request DeleteWaitingRoomRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWaitingRoomRuleResponse
     */
    public DeleteWaitingRoomRuleResponse deleteWaitingRoomRuleWithOptions(DeleteWaitingRoomRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomRuleId)) {
            query.put("WaitingRoomRuleId", request.waitingRoomRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWaitingRoomRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWaitingRoomRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a waiting room bypass rule.</p>
     * 
     * @param request DeleteWaitingRoomRuleRequest
     * @return DeleteWaitingRoomRuleResponse
     */
    public DeleteWaitingRoomRuleResponse deleteWaitingRoomRule(DeleteWaitingRoomRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWaitingRoomRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a scenario-specific policy.</p>
     * 
     * @param request DescribeCustomScenePoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomScenePoliciesResponse
     */
    public DescribeCustomScenePoliciesResponse describeCustomScenePoliciesWithOptions(DescribeCustomScenePoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomScenePolicies"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomScenePoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a scenario-specific policy.</p>
     * 
     * @param request DescribeCustomScenePoliciesRequest
     * @return DescribeCustomScenePoliciesResponse
     */
    public DescribeCustomScenePoliciesResponse describeCustomScenePolicies(DescribeCustomScenePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomScenePoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries DDoS attack events.</p>
     * 
     * @param request DescribeDDoSAllEventListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDoSAllEventListResponse
     */
    public DescribeDDoSAllEventListResponse describeDDoSAllEventListWithOptions(DescribeDDoSAllEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDoSAllEventList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDoSAllEventListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries DDoS attack events.</p>
     * 
     * @param request DescribeDDoSAllEventListRequest
     * @return DescribeDDoSAllEventListResponse
     */
    public DescribeDDoSAllEventListResponse describeDDoSAllEventList(DescribeDDoSAllEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDoSAllEventListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query DCDN DDoS user bps and pps data</p>
     * 
     * @param request DescribeDDoSBpsListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDoSBpsListResponse
     */
    public DescribeDDoSBpsListResponse describeDDoSBpsListWithOptions(DescribeDDoSBpsListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDoSBpsList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDoSBpsListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query DCDN DDoS user bps and pps data</p>
     * 
     * @param request DescribeDDoSBpsListRequest
     * @return DescribeDDoSBpsListResponse
     */
    public DescribeDDoSBpsListResponse describeDDoSBpsList(DescribeDDoSBpsListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDoSBpsListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DDoS Analysis Layer 7 QPS Trend Chart API</p>
     * 
     * @param request DescribeDDoSL7QpsListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDoSL7QpsListResponse
     */
    public DescribeDDoSL7QpsListResponse describeDDoSL7QpsListWithOptions(DescribeDDoSL7QpsListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDoSL7QpsList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDoSL7QpsListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DDoS Analysis Layer 7 QPS Trend Chart API</p>
     * 
     * @param request DescribeDDoSL7QpsListRequest
     * @return DescribeDDoSL7QpsListResponse
     */
    public DescribeDDoSL7QpsListResponse describeDDoSL7QpsList(DescribeDDoSL7QpsListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDoSL7QpsListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将天眼提供给XCDN边缘容器的监控OpenAPI适配成青蓝的OpenAPI</p>
     * 
     * @param request DescribeEdgeContainerAppStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEdgeContainerAppStatsResponse
     */
    public DescribeEdgeContainerAppStatsResponse describeEdgeContainerAppStatsWithOptions(DescribeEdgeContainerAppStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEdgeContainerAppStats"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEdgeContainerAppStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将天眼提供给XCDN边缘容器的监控OpenAPI适配成青蓝的OpenAPI</p>
     * 
     * @param request DescribeEdgeContainerAppStatsRequest
     * @return DescribeEdgeContainerAppStatsResponse
     */
    public DescribeEdgeContainerAppStatsResponse describeEdgeContainerAppStats(DescribeEdgeContainerAppStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEdgeContainerAppStatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of smart HTTP DDoS protection for a website.</p>
     * 
     * @param request DescribeHttpDDoSAttackIntelligentProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHttpDDoSAttackIntelligentProtectionResponse
     */
    public DescribeHttpDDoSAttackIntelligentProtectionResponse describeHttpDDoSAttackIntelligentProtectionWithOptions(DescribeHttpDDoSAttackIntelligentProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHttpDDoSAttackIntelligentProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHttpDDoSAttackIntelligentProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of smart HTTP DDoS protection for a website.</p>
     * 
     * @param request DescribeHttpDDoSAttackIntelligentProtectionRequest
     * @return DescribeHttpDDoSAttackIntelligentProtectionResponse
     */
    public DescribeHttpDDoSAttackIntelligentProtectionResponse describeHttpDDoSAttackIntelligentProtection(DescribeHttpDDoSAttackIntelligentProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHttpDDoSAttackIntelligentProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of HTTP DDoS attack protection.</p>
     * 
     * @param request DescribeHttpDDoSAttackProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHttpDDoSAttackProtectionResponse
     */
    public DescribeHttpDDoSAttackProtectionResponse describeHttpDDoSAttackProtectionWithOptions(DescribeHttpDDoSAttackProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHttpDDoSAttackProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHttpDDoSAttackProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of HTTP DDoS attack protection.</p>
     * 
     * @param request DescribeHttpDDoSAttackProtectionRequest
     * @return DescribeHttpDDoSAttackProtectionResponse
     */
    public DescribeHttpDDoSAttackProtectionResponse describeHttpDDoSAttackProtection(DescribeHttpDDoSAttackProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHttpDDoSAttackProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether Edge KV is activated in your Alibaba Cloud account.</p>
     * 
     * @param request DescribeKvAccountStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKvAccountStatusResponse
     */
    public DescribeKvAccountStatusResponse describeKvAccountStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKvAccountStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKvAccountStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether Edge KV is activated in your Alibaba Cloud account.</p>
     * @return DescribeKvAccountStatusResponse
     */
    public DescribeKvAccountStatusResponse describeKvAccountStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKvAccountStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of prefetch tasks by time, task status, or prefetch URL.</p>
     * 
     * @param request DescribePreloadTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePreloadTasksResponse
     */
    public DescribePreloadTasksResponse describePreloadTasksWithOptions(DescribePreloadTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePreloadTasks"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePreloadTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of prefetch tasks by time, task status, or prefetch URL.</p>
     * 
     * @param request DescribePreloadTasksRequest
     * @return DescribePreloadTasksResponse
     */
    public DescribePreloadTasksResponse describePreloadTasks(DescribePreloadTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePreloadTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of purge tasks.</p>
     * 
     * @param request DescribePurgeTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePurgeTasksResponse
     */
    public DescribePurgeTasksResponse describePurgeTasksWithOptions(DescribePurgeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePurgeTasks"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePurgeTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of purge tasks.</p>
     * 
     * @param request DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     */
    public DescribePurgeTasksResponse describePurgeTasks(DescribePurgeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePurgeTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the status of an instance after you purchase a plan for the instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of an instance that uses a plan.</p>
     * 
     * @param request DescribeRatePlanInstanceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRatePlanInstanceStatusResponse
     */
    public DescribeRatePlanInstanceStatusResponse describeRatePlanInstanceStatusWithOptions(DescribeRatePlanInstanceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRatePlanInstanceStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRatePlanInstanceStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the status of an instance after you purchase a plan for the instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of an instance that uses a plan.</p>
     * 
     * @param request DescribeRatePlanInstanceStatusRequest
     * @return DescribeRatePlanInstanceStatusResponse
     */
    public DescribeRatePlanInstanceStatusResponse describeRatePlanInstanceStatus(DescribeRatePlanInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRatePlanInstanceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点离线日志</p>
     * 
     * @param request DescribeSiteLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSiteLogsResponse
     */
    public DescribeSiteLogsResponse describeSiteLogsWithOptions(DescribeSiteLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSiteLogs"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点离线日志</p>
     * 
     * @param request DescribeSiteLogsRequest
     * @return DescribeSiteLogsResponse
     */
    public DescribeSiteLogsResponse describeSiteLogs(DescribeSiteLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取时序数据</p>
     * 
     * @param tmpReq DescribeSiteTimeSeriesDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSiteTimeSeriesDataResponse
     */
    public DescribeSiteTimeSeriesDataResponse describeSiteTimeSeriesDataWithOptions(DescribeSiteTimeSeriesDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSiteTimeSeriesDataShrinkRequest request = new DescribeSiteTimeSeriesDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fields)) {
            request.fieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fields, "Fields", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldsShrink)) {
            query.put("Fields", request.fieldsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSiteTimeSeriesData"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteTimeSeriesDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取时序数据</p>
     * 
     * @param request DescribeSiteTimeSeriesDataRequest
     * @return DescribeSiteTimeSeriesDataResponse
     */
    public DescribeSiteTimeSeriesDataResponse describeSiteTimeSeriesData(DescribeSiteTimeSeriesDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteTimeSeriesDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Top数据</p>
     * 
     * @param tmpReq DescribeSiteTopDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSiteTopDataResponse
     */
    public DescribeSiteTopDataResponse describeSiteTopDataWithOptions(DescribeSiteTopDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSiteTopDataShrinkRequest request = new DescribeSiteTopDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fields)) {
            request.fieldsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fields, "Fields", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldsShrink)) {
            query.put("Fields", request.fieldsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSiteTopData"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteTopDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Top数据</p>
     * 
     * @param request DescribeSiteTopDataRequest
     * @return DescribeSiteTopDataResponse
     */
    public DescribeSiteTopDataResponse describeSiteTopData(DescribeSiteTopDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteTopDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a scenario-specific policy.</p>
     * 
     * @param request DisableCustomScenePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableCustomScenePolicyResponse
     */
    public DisableCustomScenePolicyResponse disableCustomScenePolicyWithOptions(DisableCustomScenePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCustomScenePolicy"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCustomScenePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a scenario-specific policy.</p>
     * 
     * @param request DisableCustomScenePolicyRequest
     * @return DisableCustomScenePolicyResponse
     */
    public DisableCustomScenePolicyResponse disableCustomScenePolicy(DisableCustomScenePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableCustomScenePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Edit WAF Configuration for a Site</p>
     * 
     * @param tmpReq EditSiteWafSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditSiteWafSettingsResponse
     */
    public EditSiteWafSettingsResponse editSiteWafSettingsWithOptions(EditSiteWafSettingsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EditSiteWafSettingsShrinkRequest request = new EditSiteWafSettingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.settings)) {
            request.settingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.settings, "Settings", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.settingsShrink)) {
            body.put("Settings", request.settingsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditSiteWafSettings"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditSiteWafSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Edit WAF Configuration for a Site</p>
     * 
     * @param request EditSiteWafSettingsRequest
     * @return EditSiteWafSettingsResponse
     */
    public EditSiteWafSettingsResponse editSiteWafSettings(EditSiteWafSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editSiteWafSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a scenario-specific policy.</p>
     * 
     * @param request EnableCustomScenePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableCustomScenePolicyResponse
     */
    public EnableCustomScenePolicyResponse enableCustomScenePolicyWithOptions(EnableCustomScenePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCustomScenePolicy"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCustomScenePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a scenario-specific policy.</p>
     * 
     * @param request EnableCustomScenePolicyRequest
     * @return EnableCustomScenePolicyResponse
     */
    public EnableCustomScenePolicyResponse enableCustomScenePolicy(EnableCustomScenePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableCustomScenePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports all DNS records of a website domain as a TXT file.</p>
     * 
     * @param request ExportRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportRecordsResponse
     */
    public ExportRecordsResponse exportRecordsWithOptions(ExportRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports all DNS records of a website domain as a TXT file.</p>
     * 
     * @param request ExportRecordsRequest
     * @return ExportRecordsResponse
     */
    public ExportRecordsResponse exportRecords(ExportRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available specifications of cache reserve instances.</p>
     * 
     * @param request GetCacheReserveSpecificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCacheReserveSpecificationResponse
     */
    public GetCacheReserveSpecificationResponse getCacheReserveSpecificationWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCacheReserveSpecification"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCacheReserveSpecificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available specifications of cache reserve instances.</p>
     * @return GetCacheReserveSpecificationResponse
     */
    public GetCacheReserveSpecificationResponse getCacheReserveSpecification() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCacheReserveSpecificationWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query a single cache configuration</p>
     * 
     * @param request GetCacheRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCacheRuleResponse
     */
    public GetCacheRuleResponse getCacheRuleWithOptions(GetCacheRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCacheRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCacheRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query a single cache configuration</p>
     * 
     * @param request GetCacheRuleRequest
     * @return GetCacheRuleResponse
     */
    public GetCacheRuleResponse getCacheRule(GetCacheRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCacheRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Site Cache Tag Configuration</p>
     * 
     * @param request GetCacheTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCacheTagResponse
     */
    public GetCacheTagResponse getCacheTagWithOptions(GetCacheTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCacheTag"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCacheTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Site Cache Tag Configuration</p>
     * 
     * @param request GetCacheTagRequest
     * @return GetCacheTagResponse
     */
    public GetCacheTagResponse getCacheTag(GetCacheTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCacheTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the certificate, private key, and certificate information</p>
     * 
     * @param request GetCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCertificateResponse
     */
    public GetCertificateResponse getCertificateWithOptions(GetCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the certificate, private key, and certificate information</p>
     * 
     * @param request GetCertificateRequest
     * @return GetCertificateResponse
     */
    public GetCertificateResponse getCertificate(GetCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query certificate quota and usage</p>
     * 
     * @param request GetCertificateQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCertificateQuotaResponse
     */
    public GetCertificateQuotaResponse getCertificateQuotaWithOptions(GetCertificateQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCertificateQuota"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCertificateQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query certificate quota and usage</p>
     * 
     * @param request GetCertificateQuotaRequest
     * @return GetCertificateQuotaResponse
     */
    public GetCertificateQuotaResponse getCertificateQuota(GetCertificateQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCertificateQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a client CA certificate.</p>
     * 
     * @param request GetClientCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClientCaCertificateResponse
     */
    public GetClientCaCertificateResponse getClientCaCertificateWithOptions(GetClientCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClientCaCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClientCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a client CA certificate.</p>
     * 
     * @param request GetClientCaCertificateRequest
     * @return GetClientCaCertificateResponse
     */
    public GetClientCaCertificateResponse getClientCaCertificate(GetClientCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a client certificate.</p>
     * 
     * @param request GetClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClientCertificateResponse
     */
    public GetClientCertificateResponse getClientCertificateWithOptions(GetClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a client certificate.</p>
     * 
     * @param request GetClientCertificateRequest
     * @return GetClientCertificateResponse
     */
    public GetClientCertificateResponse getClientCertificate(GetClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries domain names associated with a client CA certificate. If no certificate is specified, domain names associated with an Edge Security Acceleration(ESA)-managed CA certificate are returned.</p>
     * 
     * @param request GetClientCertificateHostnamesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClientCertificateHostnamesResponse
     */
    public GetClientCertificateHostnamesResponse getClientCertificateHostnamesWithOptions(GetClientCertificateHostnamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClientCertificateHostnames"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClientCertificateHostnamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries domain names associated with a client CA certificate. If no certificate is specified, domain names associated with an Edge Security Acceleration(ESA)-managed CA certificate are returned.</p>
     * 
     * @param request GetClientCertificateHostnamesRequest
     * @return GetClientCertificateHostnamesResponse
     */
    public GetClientCertificateHostnamesResponse getClientCertificateHostnames(GetClientCertificateHostnamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientCertificateHostnamesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the CNAME flattening configuration of a website</p>
     * 
     * @param request GetCnameFlatteningRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCnameFlatteningResponse
     */
    public GetCnameFlatteningResponse getCnameFlatteningWithOptions(GetCnameFlatteningRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCnameFlattening"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCnameFlatteningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the CNAME flattening configuration of a website</p>
     * 
     * @param request GetCnameFlatteningRequest
     * @return GetCnameFlatteningResponse
     */
    public GetCnameFlatteningResponse getCnameFlattening(GetCnameFlatteningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCnameFlatteningWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Compression Rule Details</p>
     * 
     * @param request GetCompressionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCompressionRuleResponse
     */
    public GetCompressionRuleResponse getCompressionRuleWithOptions(GetCompressionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompressionRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompressionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Compression Rule Details</p>
     * 
     * @param request GetCompressionRuleRequest
     * @return GetCompressionRuleResponse
     */
    public GetCompressionRuleResponse getCompressionRule(GetCompressionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCompressionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点中国大陆网络接入优化配置</p>
     * 
     * @param request GetCrossBorderOptimizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCrossBorderOptimizationResponse
     */
    public GetCrossBorderOptimizationResponse getCrossBorderOptimizationWithOptions(GetCrossBorderOptimizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCrossBorderOptimization"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCrossBorderOptimizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点中国大陆网络接入优化配置</p>
     * 
     * @param request GetCrossBorderOptimizationRequest
     * @return GetCrossBorderOptimizationResponse
     */
    public GetCrossBorderOptimizationResponse getCrossBorderOptimization(GetCrossBorderOptimizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCrossBorderOptimizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Site Developer Mode Configuration</p>
     * 
     * @param request GetDevelopmentModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDevelopmentModeResponse
     */
    public GetDevelopmentModeResponse getDevelopmentModeWithOptions(GetDevelopmentModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDevelopmentMode"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDevelopmentModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Site Developer Mode Configuration</p>
     * 
     * @param request GetDevelopmentModeRequest
     * @return GetDevelopmentModeResponse
     */
    public GetDevelopmentModeResponse getDevelopmentMode(GetDevelopmentModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDevelopmentModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a containerized application, including basic application configurations and health check configurations.</p>
     * 
     * @param request GetEdgeContainerAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerAppResponse
     */
    public GetEdgeContainerAppResponse getEdgeContainerAppWithOptions(GetEdgeContainerAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerApp"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a containerized application, including basic application configurations and health check configurations.</p>
     * 
     * @param request GetEdgeContainerAppRequest
     * @return GetEdgeContainerAppResponse
     */
    public GetEdgeContainerAppResponse getEdgeContainerApp(GetEdgeContainerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log collection configuration of a containerized application.</p>
     * 
     * @param request GetEdgeContainerAppLogRiverRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerAppLogRiverResponse
     */
    public GetEdgeContainerAppLogRiverResponse getEdgeContainerAppLogRiverWithOptions(GetEdgeContainerAppLogRiverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerAppLogRiver"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerAppLogRiverResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log collection configuration of a containerized application.</p>
     * 
     * @param request GetEdgeContainerAppLogRiverRequest
     * @return GetEdgeContainerAppLogRiverResponse
     */
    public GetEdgeContainerAppLogRiverResponse getEdgeContainerAppLogRiver(GetEdgeContainerAppLogRiverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerAppLogRiverWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器资源预留配置</p>
     * 
     * @param request GetEdgeContainerAppResourceReserveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerAppResourceReserveResponse
     */
    public GetEdgeContainerAppResourceReserveResponse getEdgeContainerAppResourceReserveWithOptions(GetEdgeContainerAppResourceReserveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerAppResourceReserve"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerAppResourceReserveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器资源预留配置</p>
     * 
     * @param request GetEdgeContainerAppResourceReserveRequest
     * @return GetEdgeContainerAppResourceReserveResponse
     */
    public GetEdgeContainerAppResourceReserveResponse getEdgeContainerAppResourceReserve(GetEdgeContainerAppResourceReserveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerAppResourceReserveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用资源分布</p>
     * 
     * @param request GetEdgeContainerAppResourceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerAppResourceStatusResponse
     */
    public GetEdgeContainerAppResourceStatusResponse getEdgeContainerAppResourceStatusWithOptions(GetEdgeContainerAppResourceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerAppResourceStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerAppResourceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用资源分布</p>
     * 
     * @param request GetEdgeContainerAppResourceStatusRequest
     * @return GetEdgeContainerAppResourceStatusResponse
     */
    public GetEdgeContainerAppResourceStatusResponse getEdgeContainerAppResourceStatus(GetEdgeContainerAppResourceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerAppResourceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status information about a containerized application, including the deployment, release, and rollback of the application.</p>
     * 
     * @param request GetEdgeContainerAppStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerAppStatusResponse
     */
    public GetEdgeContainerAppStatusResponse getEdgeContainerAppStatusWithOptions(GetEdgeContainerAppStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishEnv)) {
            query.put("PublishEnv", request.publishEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerAppStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerAppStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status information about a containerized application, including the deployment, release, and rollback of the application.</p>
     * 
     * @param request GetEdgeContainerAppStatusRequest
     * @return GetEdgeContainerAppStatusResponse
     */
    public GetEdgeContainerAppStatusResponse getEdgeContainerAppStatus(GetEdgeContainerAppStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerAppStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a version of a containerized application. You can select an application version to release based on the version information.</p>
     * 
     * @param request GetEdgeContainerAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerAppVersionResponse
     */
    public GetEdgeContainerAppVersionResponse getEdgeContainerAppVersionWithOptions(GetEdgeContainerAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerAppVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a version of a containerized application. You can select an application version to release based on the version information.</p>
     * 
     * @param request GetEdgeContainerAppVersionRequest
     * @return GetEdgeContainerAppVersionResponse
     */
    public GetEdgeContainerAppVersionResponse getEdgeContainerAppVersion(GetEdgeContainerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions where a containerized application is deployed based on the application ID.</p>
     * 
     * @param request GetEdgeContainerDeployRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerDeployRegionsResponse
     */
    public GetEdgeContainerDeployRegionsResponse getEdgeContainerDeployRegionsWithOptions(GetEdgeContainerDeployRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerDeployRegions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerDeployRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions where a containerized application is deployed based on the application ID.</p>
     * 
     * @param request GetEdgeContainerDeployRegionsRequest
     * @return GetEdgeContainerDeployRegionsResponse
     */
    public GetEdgeContainerDeployRegionsResponse getEdgeContainerDeployRegions(GetEdgeContainerDeployRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerDeployRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Edge Container logs.</p>
     * 
     * @param request GetEdgeContainerLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerLogsResponse
     */
    public GetEdgeContainerLogsResponse getEdgeContainerLogsWithOptions(GetEdgeContainerLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerLogs"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Edge Container logs.</p>
     * 
     * @param request GetEdgeContainerLogsRequest
     * @return GetEdgeContainerLogsResponse
     */
    public GetEdgeContainerLogsResponse getEdgeContainerLogs(GetEdgeContainerLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the deployment status of an application in the staging environment by using the application ID.</p>
     * 
     * @param request GetEdgeContainerStagingDeployStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerStagingDeployStatusResponse
     */
    public GetEdgeContainerStagingDeployStatusResponse getEdgeContainerStagingDeployStatusWithOptions(GetEdgeContainerStagingDeployStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerStagingDeployStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerStagingDeployStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the deployment status of an application in the staging environment by using the application ID.</p>
     * 
     * @param request GetEdgeContainerStagingDeployStatusRequest
     * @return GetEdgeContainerStagingDeployStatusResponse
     */
    public GetEdgeContainerStagingDeployStatusResponse getEdgeContainerStagingDeployStatus(GetEdgeContainerStagingDeployStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerStagingDeployStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the terminal information of a containerized application.</p>
     * 
     * @param request GetEdgeContainerTerminalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerTerminalResponse
     */
    public GetEdgeContainerTerminalResponse getEdgeContainerTerminalWithOptions(GetEdgeContainerTerminalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerTerminal"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerTerminalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the terminal information of a containerized application.</p>
     * 
     * @param request GetEdgeContainerTerminalRequest
     * @return GetEdgeContainerTerminalResponse
     */
    public GetEdgeContainerTerminalResponse getEdgeContainerTerminal(GetEdgeContainerTerminalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerTerminalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the status of Edge Routine.</p>
     * 
     * @param request GetErServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetErServiceResponse
     */
    public GetErServiceResponse getErServiceWithOptions(GetErServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetErService"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetErServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the status of Edge Routine.</p>
     * 
     * @param request GetErServiceRequest
     * @return GetErServiceResponse
     */
    public GetErServiceResponse getErService(GetErServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getErServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query HTTP Request Header Rule Details</p>
     * 
     * @param request GetHttpRequestHeaderModificationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHttpRequestHeaderModificationRuleResponse
     */
    public GetHttpRequestHeaderModificationRuleResponse getHttpRequestHeaderModificationRuleWithOptions(GetHttpRequestHeaderModificationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHttpRequestHeaderModificationRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHttpRequestHeaderModificationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query HTTP Request Header Rule Details</p>
     * 
     * @param request GetHttpRequestHeaderModificationRuleRequest
     * @return GetHttpRequestHeaderModificationRuleResponse
     */
    public GetHttpRequestHeaderModificationRuleResponse getHttpRequestHeaderModificationRule(GetHttpRequestHeaderModificationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHttpRequestHeaderModificationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query HTTP Response Header Rules</p>
     * 
     * @param request GetHttpResponseHeaderModificationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHttpResponseHeaderModificationRuleResponse
     */
    public GetHttpResponseHeaderModificationRuleResponse getHttpResponseHeaderModificationRuleWithOptions(GetHttpResponseHeaderModificationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHttpResponseHeaderModificationRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHttpResponseHeaderModificationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query HTTP Response Header Rules</p>
     * 
     * @param request GetHttpResponseHeaderModificationRuleRequest
     * @return GetHttpResponseHeaderModificationRuleResponse
     */
    public GetHttpResponseHeaderModificationRuleResponse getHttpResponseHeaderModificationRule(GetHttpResponseHeaderModificationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHttpResponseHeaderModificationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query a Single HTTPS Application Configuration</p>
     * 
     * @param request GetHttpsApplicationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHttpsApplicationConfigurationResponse
     */
    public GetHttpsApplicationConfigurationResponse getHttpsApplicationConfigurationWithOptions(GetHttpsApplicationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHttpsApplicationConfiguration"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHttpsApplicationConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query a Single HTTPS Application Configuration</p>
     * 
     * @param request GetHttpsApplicationConfigurationRequest
     * @return GetHttpsApplicationConfigurationResponse
     */
    public GetHttpsApplicationConfigurationResponse getHttpsApplicationConfiguration(GetHttpsApplicationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHttpsApplicationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query a Single HTTPS Basic Configuration</p>
     * 
     * @param request GetHttpsBasicConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHttpsBasicConfigurationResponse
     */
    public GetHttpsBasicConfigurationResponse getHttpsBasicConfigurationWithOptions(GetHttpsBasicConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHttpsBasicConfiguration"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHttpsBasicConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query a Single HTTPS Basic Configuration</p>
     * 
     * @param request GetHttpsBasicConfigurationRequest
     * @return GetHttpsBasicConfigurationResponse
     */
    public GetHttpsBasicConfigurationResponse getHttpsBasicConfiguration(GetHttpsBasicConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHttpsBasicConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IPv6 configuration of a website.</p>
     * 
     * @param request GetIPv6Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIPv6Response
     */
    public GetIPv6Response getIPv6WithOptions(GetIPv6Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIPv6"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIPv6Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IPv6 configuration of a website.</p>
     * 
     * @param request GetIPv6Request
     * @return GetIPv6Response
     */
    public GetIPv6Response getIPv6(GetIPv6Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIPv6WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Single Site Image Transformation Configuration</p>
     * 
     * @param request GetImageTransformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageTransformResponse
     */
    public GetImageTransformResponse getImageTransformWithOptions(GetImageTransformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageTransform"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageTransformResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Single Site Image Transformation Configuration</p>
     * 
     * @param request GetImageTransformRequest
     * @return GetImageTransformResponse
     */
    public GetImageTransformResponse getImageTransform(GetImageTransformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageTransformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the value of a key in a key-value pair.</p>
     * 
     * @param request GetKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKvResponse
     */
    public GetKvResponse getKvWithOptions(GetKvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the value of a key in a key-value pair.</p>
     * 
     * @param request GetKvRequest
     * @return GetKvResponse
     */
    public GetKvResponse getKv(GetKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Edge KV usage in your Alibaba Cloud account, including the information about all namespaces.</p>
     * 
     * @param request GetKvAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKvAccountResponse
     */
    public GetKvAccountResponse getKvAccountWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKvAccount"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKvAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Edge KV usage in your Alibaba Cloud account, including the information about all namespaces.</p>
     * @return GetKvAccountResponse
     */
    public GetKvAccountResponse getKvAccount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKvAccountWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a namespace in your Alibaba Cloud account.</p>
     * 
     * @param request GetKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKvNamespaceResponse
     */
    public GetKvNamespaceResponse getKvNamespaceWithOptions(GetKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKvNamespace"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKvNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a namespace in your Alibaba Cloud account.</p>
     * 
     * @param request GetKvNamespaceRequest
     * @return GetKvNamespaceResponse
     */
    public GetKvNamespaceResponse getKvNamespace(GetKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a custom list, such as the name, description, type, and content.</p>
     * 
     * @param request GetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetListResponse
     */
    public GetListResponse getListWithOptions(GetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a custom list, such as the name, description, type, and content.</p>
     * 
     * @param request GetListRequest
     * @return GetListResponse
     */
    public GetListResponse getList(GetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API allows users to query the configuration details of a specific load balancer by providing necessary authentication information and resource identifiers, including but not limited to name, session persistence strategy, routing policy, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Query a Specific Load Balancer</p>
     * 
     * @param request GetLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoadBalancerResponse
     */
    public GetLoadBalancerResponse getLoadBalancerWithOptions(GetLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoadBalancer"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoadBalancerResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API allows users to query the configuration details of a specific load balancer by providing necessary authentication information and resource identifiers, including but not limited to name, session persistence strategy, routing policy, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Query a Specific Load Balancer</p>
     * 
     * @param request GetLoadBalancerRequest
     * @return GetLoadBalancerResponse
     */
    public GetLoadBalancerResponse getLoadBalancer(GetLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoadBalancerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Managed Transform Configuration</p>
     * 
     * @param request GetManagedTransformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetManagedTransformResponse
     */
    public GetManagedTransformResponse getManagedTransformWithOptions(GetManagedTransformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetManagedTransform"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetManagedTransformResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Managed Transform Configuration</p>
     * 
     * @param request GetManagedTransformRequest
     * @return GetManagedTransformResponse
     */
    public GetManagedTransformResponse getManagedTransform(GetManagedTransformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getManagedTransformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query a single network optimization configuration</p>
     * 
     * @param request GetNetworkOptimizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNetworkOptimizationResponse
     */
    public GetNetworkOptimizationResponse getNetworkOptimizationWithOptions(GetNetworkOptimizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetworkOptimization"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNetworkOptimizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query a single network optimization configuration</p>
     * 
     * @param request GetNetworkOptimizationRequest
     * @return GetNetworkOptimizationResponse
     */
    public GetNetworkOptimizationResponse getNetworkOptimization(GetNetworkOptimizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetworkOptimizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取源服务器CA证书信息</p>
     * 
     * @param request GetOriginCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOriginCaCertificateResponse
     */
    public GetOriginCaCertificateResponse getOriginCaCertificateWithOptions(GetOriginCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOriginCaCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOriginCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取源服务器CA证书信息</p>
     * 
     * @param request GetOriginCaCertificateRequest
     * @return GetOriginCaCertificateResponse
     */
    public GetOriginCaCertificateResponse getOriginCaCertificate(GetOriginCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOriginCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取域名回源客户端证书信息</p>
     * 
     * @param request GetOriginClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOriginClientCertificateResponse
     */
    public GetOriginClientCertificateResponse getOriginClientCertificateWithOptions(GetOriginClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOriginClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOriginClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取域名回源客户端证书信息</p>
     * 
     * @param request GetOriginClientCertificateRequest
     * @return GetOriginClientCertificateResponse
     */
    public GetOriginClientCertificateResponse getOriginClientCertificate(GetOriginClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOriginClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取域名回源客户端证书绑定的域名列表</p>
     * 
     * @param request GetOriginClientCertificateHostnamesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOriginClientCertificateHostnamesResponse
     */
    public GetOriginClientCertificateHostnamesResponse getOriginClientCertificateHostnamesWithOptions(GetOriginClientCertificateHostnamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOriginClientCertificateHostnames"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOriginClientCertificateHostnamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取域名回源客户端证书绑定的域名列表</p>
     * 
     * @param request GetOriginClientCertificateHostnamesRequest
     * @return GetOriginClientCertificateHostnamesResponse
     */
    public GetOriginClientCertificateHostnamesResponse getOriginClientCertificateHostnames(GetOriginClientCertificateHostnamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOriginClientCertificateHostnamesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query a specific origin pool</p>
     * 
     * @param request GetOriginPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOriginPoolResponse
     */
    public GetOriginPoolResponse getOriginPoolWithOptions(GetOriginPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOriginPool"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOriginPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query a specific origin pool</p>
     * 
     * @param request GetOriginPoolRequest
     * @return GetOriginPoolResponse
     */
    public GetOriginPoolResponse getOriginPool(GetOriginPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOriginPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the origin protection configurations of a website, including the origin protection, IP convergence, and the status and details of the IP whitelist for origin protection. The details includes the IP whitelist used by the website, the latest IP whitelist, and the differences between them.</p>
     * 
     * @param request GetOriginProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOriginProtectionResponse
     */
    public GetOriginProtectionResponse getOriginProtectionWithOptions(GetOriginProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOriginProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOriginProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the origin protection configurations of a website, including the origin protection, IP convergence, and the status and details of the IP whitelist for origin protection. The details includes the IP whitelist used by the website, the latest IP whitelist, and the differences between them.</p>
     * 
     * @param request GetOriginProtectionRequest
     * @return GetOriginProtectionResponse
     */
    public GetOriginProtectionResponse getOriginProtection(GetOriginProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOriginProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query a Single Origin Rule Configuration</p>
     * 
     * @param request GetOriginRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOriginRuleResponse
     */
    public GetOriginRuleResponse getOriginRuleWithOptions(GetOriginRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOriginRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOriginRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query a Single Origin Rule Configuration</p>
     * 
     * @param request GetOriginRuleRequest
     * @return GetOriginRuleResponse
     */
    public GetOriginRuleResponse getOriginRule(GetOriginRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOriginRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a custom error page based on the error page ID.</p>
     * 
     * @param request GetPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPageResponse
     */
    public GetPageResponse getPageWithOptions(GetPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a custom error page based on the error page ID.</p>
     * 
     * @param request GetPageRequest
     * @return GetPageResponse
     */
    public GetPageResponse getPage(GetPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quotas and quota usage for different cache purge options.</p>
     * 
     * @param request GetPurgeQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPurgeQuotaResponse
     */
    public GetPurgeQuotaResponse getPurgeQuotaWithOptions(GetPurgeQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPurgeQuota"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPurgeQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quotas and quota usage for different cache purge options.</p>
     * 
     * @param request GetPurgeQuotaRequest
     * @return GetPurgeQuotaResponse
     */
    public GetPurgeQuotaResponse getPurgeQuota(GetPurgeQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPurgeQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the fields in real-time logs based on the log category.</p>
     * 
     * @param request GetRealtimeDeliveryFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRealtimeDeliveryFieldResponse
     */
    public GetRealtimeDeliveryFieldResponse getRealtimeDeliveryFieldWithOptions(GetRealtimeDeliveryFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealtimeDeliveryField"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealtimeDeliveryFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the fields in real-time logs based on the log category.</p>
     * 
     * @param request GetRealtimeDeliveryFieldRequest
     * @return GetRealtimeDeliveryFieldResponse
     */
    public GetRealtimeDeliveryFieldResponse getRealtimeDeliveryField(GetRealtimeDeliveryFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealtimeDeliveryFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of a single DNS record, such as the record value, priority, and origin authentication setting (exclusive to CNAME records).</p>
     * 
     * @param request GetRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecordResponse
     */
    public GetRecordResponse getRecordWithOptions(GetRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of a single DNS record, such as the record value, priority, and origin authentication setting (exclusive to CNAME records).</p>
     * 
     * @param request GetRecordRequest
     * @return GetRecordResponse
     */
    public GetRecordResponse getRecord(GetRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Redirect Rule Details</p>
     * 
     * @param request GetRedirectRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRedirectRuleResponse
     */
    public GetRedirectRuleResponse getRedirectRuleWithOptions(GetRedirectRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRedirectRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRedirectRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Redirect Rule Details</p>
     * 
     * @param request GetRedirectRuleRequest
     * @return GetRedirectRuleResponse
     */
    public GetRedirectRuleResponse getRedirectRule(GetRedirectRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRedirectRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query details of the rewrite URL rule</p>
     * 
     * @param request GetRewriteUrlRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRewriteUrlRuleResponse
     */
    public GetRewriteUrlRuleResponse getRewriteUrlRuleWithOptions(GetRewriteUrlRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRewriteUrlRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRewriteUrlRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query details of the rewrite URL rule</p>
     * 
     * @param request GetRewriteUrlRuleRequest
     * @return GetRewriteUrlRuleResponse
     */
    public GetRewriteUrlRuleResponse getRewriteUrlRule(GetRewriteUrlRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRewriteUrlRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a routine, including the code versions and the configurations of the environments, associated domain names, and associated routes.</p>
     * 
     * @param request GetRoutineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoutineResponse
     */
    public GetRoutineResponse getRoutineWithOptions(GetRoutineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoutine"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoutineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a routine, including the code versions and the configurations of the environments, associated domain names, and associated routes.</p>
     * 
     * @param request GetRoutineRequest
     * @return GetRoutineResponse
     */
    public GetRoutineResponse getRoutine(GetRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoutineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单条边缘函数路由配置</p>
     * 
     * @param request GetRoutineRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoutineRouteResponse
     */
    public GetRoutineRouteResponse getRoutineRouteWithOptions(GetRoutineRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoutineRoute"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoutineRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单条边缘函数路由配置</p>
     * 
     * @param request GetRoutineRouteRequest
     * @return GetRoutineRouteResponse
     */
    public GetRoutineRouteResponse getRoutineRoute(GetRoutineRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoutineRouteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Every time the code of a routine is released to the staging environment, a version number is generated. Such code is for tests only.</p>
     * <ul>
     * <li>A routine can retain a maximum of 10 code versions. If the number of versions reaches the limit, you must call the DeleteRoutineCodeRevision operation to delete unwanted versions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the release information about the routine code that is released to the staging environment. This information can be used to upload the test code to Object Storage Service (OSS).</p>
     * 
     * @param request GetRoutineStagingCodeUploadInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoutineStagingCodeUploadInfoResponse
     */
    public GetRoutineStagingCodeUploadInfoResponse getRoutineStagingCodeUploadInfoWithOptions(GetRoutineStagingCodeUploadInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeDescription)) {
            body.put("CodeDescription", request.codeDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoutineStagingCodeUploadInfo"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoutineStagingCodeUploadInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Every time the code of a routine is released to the staging environment, a version number is generated. Such code is for tests only.</p>
     * <ul>
     * <li>A routine can retain a maximum of 10 code versions. If the number of versions reaches the limit, you must call the DeleteRoutineCodeRevision operation to delete unwanted versions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the release information about the routine code that is released to the staging environment. This information can be used to upload the test code to Object Storage Service (OSS).</p>
     * 
     * @param request GetRoutineStagingCodeUploadInfoRequest
     * @return GetRoutineStagingCodeUploadInfoResponse
     */
    public GetRoutineStagingCodeUploadInfoResponse getRoutineStagingCodeUploadInfo(GetRoutineStagingCodeUploadInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoutineStagingCodeUploadInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP addresses of staging environments for Edge Routine.</p>
     * 
     * @param request GetRoutineStagingEnvIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoutineStagingEnvIpResponse
     */
    public GetRoutineStagingEnvIpResponse getRoutineStagingEnvIpWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoutineStagingEnvIp"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoutineStagingEnvIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP addresses of staging environments for Edge Routine.</p>
     * @return GetRoutineStagingEnvIpResponse
     */
    public GetRoutineStagingEnvIpResponse getRoutineStagingEnvIp() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoutineStagingEnvIpWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Edge Routine information in your Alibaba Cloud account, including the associated subdomain and created routines.</p>
     * 
     * @param request GetRoutineUserInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoutineUserInfoResponse
     */
    public GetRoutineUserInfoResponse getRoutineUserInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoutineUserInfo"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoutineUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Edge Routine information in your Alibaba Cloud account, including the associated subdomain and created routines.</p>
     * @return GetRoutineUserInfoResponse
     */
    public GetRoutineUserInfoResponse getRoutineUserInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoutineUserInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a specified scheduled prefetch task based on the task ID.</p>
     * 
     * @param request GetScheduledPreloadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduledPreloadJobResponse
     */
    public GetScheduledPreloadJobResponse getScheduledPreloadJobWithOptions(GetScheduledPreloadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheduledPreloadJob"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduledPreloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a specified scheduled prefetch task based on the task ID.</p>
     * 
     * @param request GetScheduledPreloadJobRequest
     * @return GetScheduledPreloadJobResponse
     */
    public GetScheduledPreloadJobResponse getScheduledPreloadJob(GetScheduledPreloadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScheduledPreloadJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration for search engine crawler of a website.</p>
     * 
     * @param request GetSeoBypassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSeoBypassResponse
     */
    public GetSeoBypassResponse getSeoBypassWithOptions(GetSeoBypassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSeoBypass"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSeoBypassResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration for search engine crawler of a website.</p>
     * 
     * @param request GetSeoBypassRequest
     * @return GetSeoBypassResponse
     */
    public GetSeoBypassResponse getSeoBypass(GetSeoBypassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSeoBypassWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a website based on the website ID.</p>
     * 
     * @param request GetSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteResponse
     */
    public GetSiteResponse getSiteWithOptions(GetSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSite"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a website based on the website ID.</p>
     * 
     * @param request GetSiteRequest
     * @return GetSiteResponse
     */
    public GetSiteResponse getSite(GetSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the nameservers configured for a website.</p>
     * 
     * @param request GetSiteCurrentNSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteCurrentNSResponse
     */
    public GetSiteCurrentNSResponse getSiteCurrentNSWithOptions(GetSiteCurrentNSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteCurrentNS"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteCurrentNSResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the nameservers configured for a website.</p>
     * 
     * @param request GetSiteCurrentNSRequest
     * @return GetSiteCurrentNSResponse
     */
    public GetSiteCurrentNSResponse getSiteCurrentNS(GetSiteCurrentNSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteCurrentNSWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Description</strong>: You can call this operation to query the configuration of custom log fields for a website, including custom fields in request headers, response headers, and cookies.</p>
     * <ul>
     * <li><strong>Scenarios</strong>: You can call this operation in scenarios where you need to obtain specific HTTP headers or cookie information for log analysis.</li>
     * </ul>
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration of custom log fields for a website.</p>
     * 
     * @param request GetSiteCustomLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteCustomLogResponse
     */
    public GetSiteCustomLogResponse getSiteCustomLogWithOptions(GetSiteCustomLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteCustomLog"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteCustomLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Description</strong>: You can call this operation to query the configuration of custom log fields for a website, including custom fields in request headers, response headers, and cookies.</p>
     * <ul>
     * <li><strong>Scenarios</strong>: You can call this operation in scenarios where you need to obtain specific HTTP headers or cookie information for log analysis.</li>
     * </ul>
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration of custom log fields for a website.</p>
     * 
     * @param request GetSiteCustomLogRequest
     * @return GetSiteCustomLogResponse
     */
    public GetSiteCustomLogResponse getSiteCustomLog(GetSiteCustomLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteCustomLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a real-time log delivery task.</p>
     * 
     * @param request GetSiteDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteDeliveryTaskResponse
     */
    public GetSiteDeliveryTaskResponse getSiteDeliveryTaskWithOptions(GetSiteDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a real-time log delivery task.</p>
     * 
     * @param request GetSiteDeliveryTaskRequest
     * @return GetSiteDeliveryTaskResponse
     */
    public GetSiteDeliveryTaskResponse getSiteDeliveryTask(GetSiteDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the remaining quota for delivering a specific category of real-time logs in a website within an Alibaba Cloud account. This is essential for monitoring and managing your log delivery capacity to ensure that logs can be delivered to the destination and prevent data loss or latency caused by insufficient quota.
     * <strong>Take note of the following parameters:</strong></p>
     * <ul>
     * <li>``</li>
     * <li><code>BusinessType</code> is required. You must specify a log category to obtain the corresponding quota information.</li>
     * <li><code>SiteId</code> specifies the ID of a website, which must be a valid integer that corresponds to a website that you configured on Alibaba Cloud.
     * <strong>Response:</strong></li>
     * <li>If a request is successful, the system returns the remaining log delivery quota (<code>FreeQuota</code>), request ID (<code>RequestId</code>), website ID (<code>SiteId</code>), and log category (<code>BusinessType</code>). You can confirm and record the returned data.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the remaining quota for delivering a specific category of real-time logs in a website.</p>
     * 
     * @param request GetSiteLogDeliveryQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteLogDeliveryQuotaResponse
     */
    public GetSiteLogDeliveryQuotaResponse getSiteLogDeliveryQuotaWithOptions(GetSiteLogDeliveryQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteLogDeliveryQuota"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteLogDeliveryQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the remaining quota for delivering a specific category of real-time logs in a website within an Alibaba Cloud account. This is essential for monitoring and managing your log delivery capacity to ensure that logs can be delivered to the destination and prevent data loss or latency caused by insufficient quota.
     * <strong>Take note of the following parameters:</strong></p>
     * <ul>
     * <li>``</li>
     * <li><code>BusinessType</code> is required. You must specify a log category to obtain the corresponding quota information.</li>
     * <li><code>SiteId</code> specifies the ID of a website, which must be a valid integer that corresponds to a website that you configured on Alibaba Cloud.
     * <strong>Response:</strong></li>
     * <li>If a request is successful, the system returns the remaining log delivery quota (<code>FreeQuota</code>), request ID (<code>RequestId</code>), website ID (<code>SiteId</code>), and log category (<code>BusinessType</code>). You can confirm and record the returned data.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the remaining quota for delivering a specific category of real-time logs in a website.</p>
     * 
     * @param request GetSiteLogDeliveryQuotaRequest
     * @return GetSiteLogDeliveryQuotaResponse
     */
    public GetSiteLogDeliveryQuotaResponse getSiteLogDeliveryQuota(GetSiteLogDeliveryQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteLogDeliveryQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the site hold configuration of a website. After you enable site hold, other accounts cannot add your website domain or its subdomains to ESA.</p>
     * 
     * @param request GetSiteNameExclusiveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteNameExclusiveResponse
     */
    public GetSiteNameExclusiveResponse getSiteNameExclusiveWithOptions(GetSiteNameExclusiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteNameExclusive"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteNameExclusiveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the site hold configuration of a website. After you enable site hold, other accounts cannot add your website domain or its subdomains to ESA.</p>
     * 
     * @param request GetSiteNameExclusiveRequest
     * @return GetSiteNameExclusiveResponse
     */
    public GetSiteNameExclusiveResponse getSiteNameExclusive(GetSiteNameExclusiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteNameExclusiveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取站点回源客户端证书信息</p>
     * 
     * @param request GetSiteOriginClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteOriginClientCertificateResponse
     */
    public GetSiteOriginClientCertificateResponse getSiteOriginClientCertificateWithOptions(GetSiteOriginClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteOriginClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteOriginClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取站点回源客户端证书信息</p>
     * 
     * @param request GetSiteOriginClientCertificateRequest
     * @return GetSiteOriginClientCertificateResponse
     */
    public GetSiteOriginClientCertificateResponse getSiteOriginClientCertificate(GetSiteOriginClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteOriginClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ESA proxy configuration of a website.</p>
     * 
     * @param request GetSitePauseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSitePauseResponse
     */
    public GetSitePauseResponse getSitePauseWithOptions(GetSitePauseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSitePause"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSitePauseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ESA proxy configuration of a website.</p>
     * 
     * @param request GetSitePauseRequest
     * @return GetSitePauseResponse
     */
    public GetSitePauseResponse getSitePause(GetSitePauseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSitePauseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get WAF Configuration for a Site</p>
     * 
     * @param request GetSiteWafSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteWafSettingsResponse
     */
    public GetSiteWafSettingsResponse getSiteWafSettingsWithOptions(GetSiteWafSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteWafSettings"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteWafSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get WAF Configuration for a Site</p>
     * 
     * @param request GetSiteWafSettingsRequest
     * @return GetSiteWafSettingsResponse
     */
    public GetSiteWafSettingsResponse getSiteWafSettings(GetSiteWafSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteWafSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Multi-level Cache Configuration for Site</p>
     * 
     * @param request GetTieredCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTieredCacheResponse
     */
    public GetTieredCacheResponse getTieredCacheWithOptions(GetTieredCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTieredCache"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTieredCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Multi-level Cache Configuration for Site</p>
     * 
     * @param request GetTieredCacheRequest
     * @return GetTieredCacheResponse
     */
    public GetTieredCacheResponse getTieredCache(GetTieredCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTieredCacheWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status and running information of a file upload task based on the task ID.</p>
     * 
     * @param request GetUploadTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadTaskResponse
     */
    public GetUploadTaskResponse getUploadTaskWithOptions(GetUploadTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status and running information of a file upload task based on the task ID.</p>
     * 
     * @param request GetUploadTaskRequest
     * @return GetUploadTaskResponse
     */
    public GetUploadTaskResponse getUploadTask(GetUploadTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This API operation queries the details of a delivery task, including the task name, discard rate, region, log category, status, delivery destination, configuration, and filtering rules.****</p>
     * <ul>
     * <li>You can call this operation to query detailed information about a log delivery task to analyze log processing efficiency or troubleshoot delivery problems.****</li>
     * <li>****````</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a log delivery task by account.</p>
     * 
     * @param request GetUserDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserDeliveryTaskResponse
     */
    public GetUserDeliveryTaskResponse getUserDeliveryTaskWithOptions(GetUserDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserDeliveryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This API operation queries the details of a delivery task, including the task name, discard rate, region, log category, status, delivery destination, configuration, and filtering rules.****</p>
     * <ul>
     * <li>You can call this operation to query detailed information about a log delivery task to analyze log processing efficiency or troubleshoot delivery problems.****</li>
     * <li>****````</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a log delivery task by account.</p>
     * 
     * @param request GetUserDeliveryTaskRequest
     * @return GetUserDeliveryTaskResponse
     */
    public GetUserDeliveryTaskResponse getUserDeliveryTask(GetUserDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the remaining real-time log delivery quota of each log category in your Alibaba Cloud account. You must provide your Alibaba Cloud account ID (aliUid) and log category (BusinessType). The system then returns the remaining quota of the log category to help you track the usage.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the remaining log delivery quota of each log category in your account.</p>
     * 
     * @param request GetUserLogDeliveryQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserLogDeliveryQuotaResponse
     */
    public GetUserLogDeliveryQuotaResponse getUserLogDeliveryQuotaWithOptions(GetUserLogDeliveryQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserLogDeliveryQuota"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserLogDeliveryQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the remaining real-time log delivery quota of each log category in your Alibaba Cloud account. You must provide your Alibaba Cloud account ID (aliUid) and log category (BusinessType). The system then returns the remaining quota of the log category to help you track the usage.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the remaining log delivery quota of each log category in your account.</p>
     * 
     * @param request GetUserLogDeliveryQuotaRequest
     * @return GetUserLogDeliveryQuotaResponse
     */
    public GetUserLogDeliveryQuotaResponse getUserLogDeliveryQuota(GetUserLogDeliveryQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserLogDeliveryQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点视频处理配置详情</p>
     * 
     * @param request GetVideoProcessingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoProcessingResponse
     */
    public GetVideoProcessingResponse getVideoProcessingWithOptions(GetVideoProcessingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoProcessing"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoProcessingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点视频处理配置详情</p>
     * 
     * @param request GetVideoProcessingRequest
     * @return GetVideoProcessingResponse
     */
    public GetVideoProcessingResponse getVideoProcessing(GetVideoProcessingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoProcessingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain the application key (AppKey) for the BOT behavior detection feature in the site\&quot;s Web Application Firewall (WAF). The key is typically used for authentication and data exchange with the WAF service.</p>
     * 
     * @param request GetWafBotAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWafBotAppKeyResponse
     */
    public GetWafBotAppKeyResponse getWafBotAppKeyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWafBotAppKey"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWafBotAppKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This interface is used to obtain the application key (AppKey) for the BOT behavior detection feature in the site\&quot;s Web Application Firewall (WAF). The key is typically used for authentication and data exchange with the WAF service.</p>
     * @return GetWafBotAppKeyResponse
     */
    public GetWafBotAppKeyResponse getWafBotAppKey() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWafBotAppKeyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the conditions for matching incoming requests that are configured in a WAF rule category for a website. These conditions define how WAF detects and processes different types of requests.</p>
     * 
     * @param request GetWafFilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWafFilterResponse
     */
    public GetWafFilterResponse getWafFilterWithOptions(GetWafFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWafFilter"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWafFilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the conditions for matching incoming requests that are configured in a WAF rule category for a website. These conditions define how WAF detects and processes different types of requests.</p>
     * 
     * @param request GetWafFilterRequest
     * @return GetWafFilterResponse
     */
    public GetWafFilterResponse getWafFilter(GetWafFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWafFilterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get WAF Quota Details</p>
     * 
     * @param request GetWafQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWafQuotaResponse
     */
    public GetWafQuotaResponse getWafQuotaWithOptions(GetWafQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paths)) {
            query.put("Paths", request.paths);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWafQuota"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWafQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get WAF Quota Details</p>
     * 
     * @param request GetWafQuotaRequest
     * @return GetWafQuotaResponse
     */
    public GetWafQuotaResponse getWafQuota(GetWafQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWafQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Details of a Single WAF Rule</p>
     * 
     * @param request GetWafRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWafRuleResponse
     */
    public GetWafRuleResponse getWafRuleWithOptions(GetWafRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWafRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWafRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Details of a Single WAF Rule</p>
     * 
     * @param request GetWafRuleRequest
     * @return GetWafRuleResponse
     */
    public GetWafRuleResponse getWafRule(GetWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWafRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get WAF Ruleset Details</p>
     * 
     * @param request GetWafRulesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWafRulesetResponse
     */
    public GetWafRulesetResponse getWafRulesetWithOptions(GetWafRulesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWafRuleset"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWafRulesetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get WAF Ruleset Details</p>
     * 
     * @param request GetWafRulesetRequest
     * @return GetWafRulesetResponse
     */
    public GetWafRulesetResponse getWafRuleset(GetWafRulesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWafRulesetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Cache Reserve Instance List</p>
     * 
     * @param request ListCacheReserveInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCacheReserveInstancesResponse
     */
    public ListCacheReserveInstancesResponse listCacheReserveInstancesWithOptions(ListCacheReserveInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCacheReserveInstances"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCacheReserveInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Cache Reserve Instance List</p>
     * 
     * @param request ListCacheReserveInstancesRequest
     * @return ListCacheReserveInstancesResponse
     */
    public ListCacheReserveInstancesResponse listCacheReserveInstances(ListCacheReserveInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCacheReserveInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query multiple cache configurations</p>
     * 
     * @param request ListCacheRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCacheRulesResponse
     */
    public ListCacheRulesResponse listCacheRulesWithOptions(ListCacheRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCacheRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCacheRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query multiple cache configurations</p>
     * 
     * @param request ListCacheRulesRequest
     * @return ListCacheRulesResponse
     */
    public ListCacheRulesResponse listCacheRules(ListCacheRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCacheRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists certificates of a website.</p>
     * 
     * @param request ListCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificatesWithOptions(ListCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCertificates"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCertificatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists certificates of a website.</p>
     * 
     * @param request ListCertificatesRequest
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询匹配记录名的站点证书列表</p>
     * 
     * @param request ListCertificatesByRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCertificatesByRecordResponse
     */
    public ListCertificatesByRecordResponse listCertificatesByRecordWithOptions(ListCertificatesByRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCertificatesByRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCertificatesByRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询匹配记录名的站点证书列表</p>
     * 
     * @param request ListCertificatesByRecordRequest
     * @return ListCertificatesByRecordResponse
     */
    public ListCertificatesByRecordResponse listCertificatesByRecord(ListCertificatesByRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCertificatesByRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query TLS Cipher Suite List</p>
     * 
     * @param request ListCiphersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCiphersResponse
     */
    public ListCiphersResponse listCiphersWithOptions(ListCiphersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCiphers"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCiphersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query TLS Cipher Suite List</p>
     * 
     * @param request ListCiphersRequest
     * @return ListCiphersResponse
     */
    public ListCiphersResponse listCiphers(ListCiphersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCiphersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of client certificate authority (CA) certificates for a website.</p>
     * 
     * @param request ListClientCaCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClientCaCertificatesResponse
     */
    public ListClientCaCertificatesResponse listClientCaCertificatesWithOptions(ListClientCaCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClientCaCertificates"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientCaCertificatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of client certificate authority (CA) certificates for a website.</p>
     * 
     * @param request ListClientCaCertificatesRequest
     * @return ListClientCaCertificatesResponse
     */
    public ListClientCaCertificatesResponse listClientCaCertificates(ListClientCaCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientCaCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries client certificates configured for a website.</p>
     * 
     * @param request ListClientCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClientCertificatesResponse
     */
    public ListClientCertificatesResponse listClientCertificatesWithOptions(ListClientCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClientCertificates"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientCertificatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries client certificates configured for a website.</p>
     * 
     * @param request ListClientCertificatesRequest
     * @return ListClientCertificatesResponse
     */
    public ListClientCertificatesResponse listClientCertificates(ListClientCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of compression rules</p>
     * 
     * @param request ListCompressionRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCompressionRulesResponse
     */
    public ListCompressionRulesResponse listCompressionRulesWithOptions(ListCompressionRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCompressionRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCompressionRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of compression rules</p>
     * 
     * @param request ListCompressionRulesRequest
     * @return ListCompressionRulesResponse
     */
    public ListCompressionRulesResponse listCompressionRules(ListCompressionRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCompressionRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists domain names that are associated with a containerized application.</p>
     * 
     * @param request ListEdgeContainerAppRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeContainerAppRecordsResponse
     */
    public ListEdgeContainerAppRecordsResponse listEdgeContainerAppRecordsWithOptions(ListEdgeContainerAppRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeContainerAppRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeContainerAppRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists domain names that are associated with a containerized application.</p>
     * 
     * @param request ListEdgeContainerAppRecordsRequest
     * @return ListEdgeContainerAppRecordsResponse
     */
    public ListEdgeContainerAppRecordsResponse listEdgeContainerAppRecords(ListEdgeContainerAppRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeContainerAppRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists versions of all containerized applications.</p>
     * 
     * @param request ListEdgeContainerAppVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeContainerAppVersionsResponse
     */
    public ListEdgeContainerAppVersionsResponse listEdgeContainerAppVersionsWithOptions(ListEdgeContainerAppVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeContainerAppVersions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeContainerAppVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists versions of all containerized applications.</p>
     * 
     * @param request ListEdgeContainerAppVersionsRequest
     * @return ListEdgeContainerAppVersionsResponse
     */
    public ListEdgeContainerAppVersionsResponse listEdgeContainerAppVersions(ListEdgeContainerAppVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeContainerAppVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all containerized applications in your Alibaba Cloud account.</p>
     * 
     * @param request ListEdgeContainerAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeContainerAppsResponse
     */
    public ListEdgeContainerAppsResponse listEdgeContainerAppsWithOptions(ListEdgeContainerAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderKey)) {
            query.put("OrderKey", request.orderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("SearchType", request.searchType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeContainerApps"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeContainerAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all containerized applications in your Alibaba Cloud account.</p>
     * 
     * @param request ListEdgeContainerAppsRequest
     * @return ListEdgeContainerAppsResponse
     */
    public ListEdgeContainerAppsResponse listEdgeContainerApps(ListEdgeContainerAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeContainerAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the records that are associated with Edge Container for a website.</p>
     * 
     * @param request ListEdgeContainerRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeContainerRecordsResponse
     */
    public ListEdgeContainerRecordsResponse listEdgeContainerRecordsWithOptions(ListEdgeContainerRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeContainerRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeContainerRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the records that are associated with Edge Container for a website.</p>
     * 
     * @param request ListEdgeContainerRecordsRequest
     * @return ListEdgeContainerRecordsResponse
     */
    public ListEdgeContainerRecordsResponse listEdgeContainerRecords(ListEdgeContainerRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeContainerRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Edge Routine plans.</p>
     * 
     * @param request ListEdgeRoutinePlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeRoutinePlansResponse
     */
    public ListEdgeRoutinePlansResponse listEdgeRoutinePlansWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeRoutinePlans"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeRoutinePlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Edge Routine plans.</p>
     * @return ListEdgeRoutinePlansResponse
     */
    public ListEdgeRoutinePlansResponse listEdgeRoutinePlans() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeRoutinePlansWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation 100 times per second.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the records that are associated with Edge Routine routes for a website.</p>
     * 
     * @param request ListEdgeRoutineRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeRoutineRecordsResponse
     */
    public ListEdgeRoutineRecordsResponse listEdgeRoutineRecordsWithOptions(ListEdgeRoutineRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeRoutineRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeRoutineRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation 100 times per second.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the records that are associated with Edge Routine routes for a website.</p>
     * 
     * @param request ListEdgeRoutineRecordsRequest
     * @return ListEdgeRoutineRecordsResponse
     */
    public ListEdgeRoutineRecordsResponse listEdgeRoutineRecords(ListEdgeRoutineRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeRoutineRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List of HTTP Request Header Rules</p>
     * 
     * @param request ListHttpRequestHeaderModificationRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHttpRequestHeaderModificationRulesResponse
     */
    public ListHttpRequestHeaderModificationRulesResponse listHttpRequestHeaderModificationRulesWithOptions(ListHttpRequestHeaderModificationRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHttpRequestHeaderModificationRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHttpRequestHeaderModificationRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List of HTTP Request Header Rules</p>
     * 
     * @param request ListHttpRequestHeaderModificationRulesRequest
     * @return ListHttpRequestHeaderModificationRulesResponse
     */
    public ListHttpRequestHeaderModificationRulesResponse listHttpRequestHeaderModificationRules(ListHttpRequestHeaderModificationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHttpRequestHeaderModificationRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List of HTTP Response Header Rules</p>
     * 
     * @param request ListHttpResponseHeaderModificationRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHttpResponseHeaderModificationRulesResponse
     */
    public ListHttpResponseHeaderModificationRulesResponse listHttpResponseHeaderModificationRulesWithOptions(ListHttpResponseHeaderModificationRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHttpResponseHeaderModificationRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHttpResponseHeaderModificationRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List of HTTP Response Header Rules</p>
     * 
     * @param request ListHttpResponseHeaderModificationRulesRequest
     * @return ListHttpResponseHeaderModificationRulesResponse
     */
    public ListHttpResponseHeaderModificationRulesResponse listHttpResponseHeaderModificationRules(ListHttpResponseHeaderModificationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHttpResponseHeaderModificationRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query multiple HTTPS application configurations</p>
     * 
     * @param request ListHttpsApplicationConfigurationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHttpsApplicationConfigurationsResponse
     */
    public ListHttpsApplicationConfigurationsResponse listHttpsApplicationConfigurationsWithOptions(ListHttpsApplicationConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHttpsApplicationConfigurations"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHttpsApplicationConfigurationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query multiple HTTPS application configurations</p>
     * 
     * @param request ListHttpsApplicationConfigurationsRequest
     * @return ListHttpsApplicationConfigurationsResponse
     */
    public ListHttpsApplicationConfigurationsResponse listHttpsApplicationConfigurations(ListHttpsApplicationConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHttpsApplicationConfigurationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query multiple HTTPS basic configurations</p>
     * 
     * @param request ListHttpsBasicConfigurationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHttpsBasicConfigurationsResponse
     */
    public ListHttpsBasicConfigurationsResponse listHttpsBasicConfigurationsWithOptions(ListHttpsBasicConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHttpsBasicConfigurations"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHttpsBasicConfigurationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query multiple HTTPS basic configurations</p>
     * 
     * @param request ListHttpsBasicConfigurationsRequest
     * @return ListHttpsBasicConfigurationsResponse
     */
    public ListHttpsBasicConfigurationsResponse listHttpsBasicConfigurations(ListHttpsBasicConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHttpsBasicConfigurationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Multiple Site Image Transformation Configurations</p>
     * 
     * @param request ListImageTransformsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImageTransformsResponse
     */
    public ListImageTransformsResponse listImageTransformsWithOptions(ListImageTransformsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImageTransforms"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImageTransformsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Multiple Site Image Transformation Configurations</p>
     * 
     * @param request ListImageTransformsRequest
     * @return ListImageTransformsResponse
     */
    public ListImageTransformsResponse listImageTransforms(ListImageTransformsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImageTransformsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota details in a subscription plan.</p>
     * 
     * @param request ListInstanceQuotasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceQuotasResponse
     */
    public ListInstanceQuotasResponse listInstanceQuotasWithOptions(ListInstanceQuotasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceQuotas"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceQuotasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota details in a subscription plan.</p>
     * 
     * @param request ListInstanceQuotasRequest
     * @return ListInstanceQuotasResponse
     */
    public ListInstanceQuotasResponse listInstanceQuotas(ListInstanceQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceQuotasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quotas and the actual usage in a plan based on the website or plan ID.</p>
     * 
     * @param request ListInstanceQuotasWithUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceQuotasWithUsageResponse
     */
    public ListInstanceQuotasWithUsageResponse listInstanceQuotasWithUsageWithOptions(ListInstanceQuotasWithUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceQuotasWithUsage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceQuotasWithUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries quotas and the actual usage in a plan based on the website or plan ID.</p>
     * 
     * @param request ListInstanceQuotasWithUsageRequest
     * @return ListInstanceQuotasWithUsageResponse
     */
    public ListInstanceQuotasWithUsageResponse listInstanceQuotasWithUsage(ListInstanceQuotasWithUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceQuotasWithUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all key-value pairs in a namespace in your Alibaba Cloud account.</p>
     * 
     * @param request ListKvsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKvsResponse
     */
    public ListKvsResponse listKvsWithOptions(ListKvsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKvs"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKvsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all key-value pairs in a namespace in your Alibaba Cloud account.</p>
     * 
     * @param request ListKvsRequest
     * @return ListKvsResponse
     */
    public ListKvsResponse listKvs(ListKvsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKvsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all custom lists and their details in an Alibaba Cloud account. You can specify query arguments to filter the results and display the returned lists by page.</p>
     * 
     * @param tmpReq ListListsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListListsResponse
     */
    public ListListsResponse listListsWithOptions(ListListsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListListsShrinkRequest request = new ListListsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLists"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all custom lists and their details in an Alibaba Cloud account. You can specify query arguments to filter the results and display the returned lists by page.</p>
     * 
     * @param request ListListsRequest
     * @return ListListsResponse
     */
    public ListListsResponse listLists(ListListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query the status of origins under load balancers. You can pass multiple load balancer IDs at once, separated by commas. This is for load balancers that have monitors configured. It will probe the origins in the source address pools used by the load balancers and record the current status of each origin.</p>
     * <ul>
     * <li>Healthy(healthy): The probe result is available.</li>
     * <li>Unhealthy(unhealthy): The probe result is unavailable.</li>
     * <li>Unknown(unknown): Unknown, the monitor has not yet probed.</li>
     * <li>Undetected(undetected): The load balancer to which the origin belongs is not bound to a monitor.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the status of origins in load balancers</p>
     * 
     * @param request ListLoadBalancerOriginStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLoadBalancerOriginStatusResponse
     */
    public ListLoadBalancerOriginStatusResponse listLoadBalancerOriginStatusWithOptions(ListLoadBalancerOriginStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLoadBalancerOriginStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLoadBalancerOriginStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query the status of origins under load balancers. You can pass multiple load balancer IDs at once, separated by commas. This is for load balancers that have monitors configured. It will probe the origins in the source address pools used by the load balancers and record the current status of each origin.</p>
     * <ul>
     * <li>Healthy(healthy): The probe result is available.</li>
     * <li>Unhealthy(unhealthy): The probe result is unavailable.</li>
     * <li>Unknown(unknown): Unknown, the monitor has not yet probed.</li>
     * <li>Undetected(undetected): The load balancer to which the origin belongs is not bound to a monitor.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the status of origins in load balancers</p>
     * 
     * @param request ListLoadBalancerOriginStatusRequest
     * @return ListLoadBalancerOriginStatusResponse
     */
    public ListLoadBalancerOriginStatusResponse listLoadBalancerOriginStatus(ListLoadBalancerOriginStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLoadBalancerOriginStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When creating a load balancer \&quot;based on country/region scheduling\&quot; strategy through OpenAPI, use the code of primary or secondary regions to represent traffic from this geographical area.</p>
     * 
     * <b>summary</b> : 
     * <p>Query Load Balancer Region List</p>
     * 
     * @param request ListLoadBalancerRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLoadBalancerRegionsResponse
     */
    public ListLoadBalancerRegionsResponse listLoadBalancerRegionsWithOptions(ListLoadBalancerRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLoadBalancerRegions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLoadBalancerRegionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>When creating a load balancer \&quot;based on country/region scheduling\&quot; strategy through OpenAPI, use the code of primary or secondary regions to represent traffic from this geographical area.</p>
     * 
     * <b>summary</b> : 
     * <p>Query Load Balancer Region List</p>
     * 
     * @param request ListLoadBalancerRegionsRequest
     * @return ListLoadBalancerRegionsResponse
     */
    public ListLoadBalancerRegionsResponse listLoadBalancerRegions(ListLoadBalancerRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLoadBalancerRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of load balancers</p>
     * 
     * @param request ListLoadBalancersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLoadBalancersResponse
     */
    public ListLoadBalancersResponse listLoadBalancersWithOptions(ListLoadBalancersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLoadBalancers"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLoadBalancersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of load balancers</p>
     * 
     * @param request ListLoadBalancersRequest
     * @return ListLoadBalancersResponse
     */
    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLoadBalancersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List Custom Managed Rule Groups</p>
     * 
     * @param request ListManagedRulesGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListManagedRulesGroupsResponse
     */
    public ListManagedRulesGroupsResponse listManagedRulesGroupsWithOptions(ListManagedRulesGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListManagedRulesGroups"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListManagedRulesGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List Custom Managed Rule Groups</p>
     * 
     * @param request ListManagedRulesGroupsRequest
     * @return ListManagedRulesGroupsResponse
     */
    public ListManagedRulesGroupsResponse listManagedRulesGroups(ListManagedRulesGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listManagedRulesGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query multiple network optimization configurations</p>
     * 
     * @param request ListNetworkOptimizationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworkOptimizationsResponse
     */
    public ListNetworkOptimizationsResponse listNetworkOptimizationsWithOptions(ListNetworkOptimizationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetworkOptimizations"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworkOptimizationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query multiple network optimization configurations</p>
     * 
     * @param request ListNetworkOptimizationsRequest
     * @return ListNetworkOptimizationsResponse
     */
    public ListNetworkOptimizationsResponse listNetworkOptimizations(ListNetworkOptimizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkOptimizationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询源服务器CA证书列表</p>
     * 
     * @param request ListOriginCaCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOriginCaCertificatesResponse
     */
    public ListOriginCaCertificatesResponse listOriginCaCertificatesWithOptions(ListOriginCaCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOriginCaCertificates"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOriginCaCertificatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询源服务器CA证书列表</p>
     * 
     * @param request ListOriginCaCertificatesRequest
     * @return ListOriginCaCertificatesResponse
     */
    public ListOriginCaCertificatesResponse listOriginCaCertificates(ListOriginCaCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOriginCaCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名回源客户端证书列表</p>
     * 
     * @param request ListOriginClientCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOriginClientCertificatesResponse
     */
    public ListOriginClientCertificatesResponse listOriginClientCertificatesWithOptions(ListOriginClientCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOriginClientCertificates"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOriginClientCertificatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名回源客户端证书列表</p>
     * 
     * @param request ListOriginClientCertificatesRequest
     * @return ListOriginClientCertificatesResponse
     */
    public ListOriginClientCertificatesResponse listOriginClientCertificates(ListOriginClientCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOriginClientCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List Origin Pools</p>
     * 
     * @param request ListOriginPoolsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOriginPoolsResponse
     */
    public ListOriginPoolsResponse listOriginPoolsWithOptions(ListOriginPoolsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOriginPools"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOriginPoolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List Origin Pools</p>
     * 
     * @param request ListOriginPoolsRequest
     * @return ListOriginPoolsResponse
     */
    public ListOriginPoolsResponse listOriginPools(ListOriginPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOriginPoolsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query multiple origin rule configurations</p>
     * 
     * @param request ListOriginRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOriginRulesResponse
     */
    public ListOriginRulesResponse listOriginRulesWithOptions(ListOriginRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOriginRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOriginRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query multiple origin rule configurations</p>
     * 
     * @param request ListOriginRulesRequest
     * @return ListOriginRulesResponse
     */
    public ListOriginRulesResponse listOriginRules(ListOriginRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOriginRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all custom error pages that you created. You can define the page number and the number of entries per page to display the response.</p>
     * 
     * @param tmpReq ListPagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPagesResponse
     */
    public ListPagesResponse listPagesWithOptions(ListPagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPagesShrinkRequest request = new ListPagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPages"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all custom error pages that you created. You can define the page number and the number of entries per page to display the response.</p>
     * 
     * @param request ListPagesRequest
     * @return ListPagesResponse
     */
    public ListPagesResponse listPages(ListPagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The DNS records related to Edge Container, Edge Routine, and TCP/UDP proxy are not returned in this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Domain Name System (DNS) records of a website, including the record value, priority, and authentication configurations. Supports filtering by specifying parameters such as RecordName and RecordMatchType.</p>
     * 
     * @param request ListRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecordsResponse
     */
    public ListRecordsResponse listRecordsWithOptions(ListRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The DNS records related to Edge Container, Edge Routine, and TCP/UDP proxy are not returned in this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Domain Name System (DNS) records of a website, including the record value, priority, and authentication configurations. Supports filtering by specifying parameters such as RecordName and RecordMatchType.</p>
     * 
     * @param request ListRecordsRequest
     * @return ListRecordsResponse
     */
    public ListRecordsResponse listRecords(ListRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Redirect Rule List</p>
     * 
     * @param request ListRedirectRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRedirectRulesResponse
     */
    public ListRedirectRulesResponse listRedirectRulesWithOptions(ListRedirectRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRedirectRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRedirectRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Redirect Rule List</p>
     * 
     * @param request ListRedirectRulesRequest
     * @return ListRedirectRulesResponse
     */
    public ListRedirectRulesResponse listRedirectRules(ListRedirectRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRedirectRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List of Rewrite URL Rules</p>
     * 
     * @param request ListRewriteUrlRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRewriteUrlRulesResponse
     */
    public ListRewriteUrlRulesResponse listRewriteUrlRulesWithOptions(ListRewriteUrlRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRewriteUrlRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRewriteUrlRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List of Rewrite URL Rules</p>
     * 
     * @param request ListRewriteUrlRulesRequest
     * @return ListRewriteUrlRulesResponse
     */
    public ListRewriteUrlRulesResponse listRewriteUrlRules(ListRewriteUrlRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRewriteUrlRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the regions to which Edge Routine code can be released for canary deployment.</p>
     * 
     * @param request ListRoutineCanaryAreasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoutineCanaryAreasResponse
     */
    public ListRoutineCanaryAreasResponse listRoutineCanaryAreasWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoutineCanaryAreas"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoutineCanaryAreasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the regions to which Edge Routine code can be released for canary deployment.</p>
     * @return ListRoutineCanaryAreasResponse
     */
    public ListRoutineCanaryAreasResponse listRoutineCanaryAreas() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRoutineCanaryAreasWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Routine的代码版本列表</p>
     * 
     * @param request ListRoutineCodeVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoutineCodeVersionsResponse
     */
    public ListRoutineCodeVersionsResponse listRoutineCodeVersionsWithOptions(ListRoutineCodeVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyWord)) {
            body.put("SearchKeyWord", request.searchKeyWord);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoutineCodeVersions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoutineCodeVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Routine的代码版本列表</p>
     * 
     * @param request ListRoutineCodeVersionsRequest
     * @return ListRoutineCodeVersionsResponse
     */
    public ListRoutineCodeVersionsResponse listRoutineCodeVersions(ListRoutineCodeVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRoutineCodeVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询函数关联域名列表</p>
     * 
     * @param request ListRoutineRelatedRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoutineRelatedRecordsResponse
     */
    public ListRoutineRelatedRecordsResponse listRoutineRelatedRecordsWithOptions(ListRoutineRelatedRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyWord)) {
            body.put("SearchKeyWord", request.searchKeyWord);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoutineRelatedRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoutineRelatedRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询函数关联域名列表</p>
     * 
     * @param request ListRoutineRelatedRecordsRequest
     * @return ListRoutineRelatedRecordsResponse
     */
    public ListRoutineRelatedRecordsResponse listRoutineRelatedRecords(ListRoutineRelatedRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRoutineRelatedRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询边缘程序的函数路由列表</p>
     * 
     * @param request ListRoutineRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoutineRoutesResponse
     */
    public ListRoutineRoutesResponse listRoutineRoutesWithOptions(ListRoutineRoutesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routineName)) {
            query.put("RoutineName", request.routineName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoutineRoutes"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoutineRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询边缘程序的函数路由列表</p>
     * 
     * @param request ListRoutineRoutesRequest
     * @return ListRoutineRoutesResponse
     */
    public ListRoutineRoutesResponse listRoutineRoutes(ListRoutineRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRoutineRoutesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the plans in a scheduled prefetch task by task ID.</p>
     * 
     * @param request ListScheduledPreloadExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledPreloadExecutionsResponse
     */
    public ListScheduledPreloadExecutionsResponse listScheduledPreloadExecutionsWithOptions(ListScheduledPreloadExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledPreloadExecutions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduledPreloadExecutionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the plans in a scheduled prefetch task by task ID.</p>
     * 
     * @param request ListScheduledPreloadExecutionsRequest
     * @return ListScheduledPreloadExecutionsResponse
     */
    public ListScheduledPreloadExecutionsResponse listScheduledPreloadExecutions(ListScheduledPreloadExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScheduledPreloadExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scheduled prefetch tasks for a website.</p>
     * 
     * @param request ListScheduledPreloadJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledPreloadJobsResponse
     */
    public ListScheduledPreloadJobsResponse listScheduledPreloadJobsWithOptions(ListScheduledPreloadJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledPreloadJobs"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduledPreloadJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scheduled prefetch tasks for a website.</p>
     * 
     * @param request ListScheduledPreloadJobsRequest
     * @return ListScheduledPreloadJobsResponse
     */
    public ListScheduledPreloadJobsResponse listScheduledPreloadJobs(ListScheduledPreloadJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScheduledPreloadJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all log delivery tasks that are in progress.</p>
     * 
     * @param request ListSiteDeliveryTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSiteDeliveryTasksResponse
     */
    public ListSiteDeliveryTasksResponse listSiteDeliveryTasksWithOptions(ListSiteDeliveryTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSiteDeliveryTasks"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSiteDeliveryTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all log delivery tasks that are in progress.</p>
     * 
     * @param request ListSiteDeliveryTasksRequest
     * @return ListSiteDeliveryTasksResponse
     */
    public ListSiteDeliveryTasksResponse listSiteDeliveryTasks(ListSiteDeliveryTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSiteDeliveryTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点的函数路由列表</p>
     * 
     * @param request ListSiteRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSiteRoutesResponse
     */
    public ListSiteRoutesResponse listSiteRoutesWithOptions(ListSiteRoutesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("ConfigType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSiteRoutes"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSiteRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点的函数路由列表</p>
     * 
     * @param request ListSiteRoutesRequest
     * @return ListSiteRoutesResponse
     */
    public ListSiteRoutesResponse listSiteRoutes(ListSiteRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSiteRoutesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about websites in your account, such as the name, status, and configuration of each website.</p>
     * 
     * @param tmpReq ListSitesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSitesResponse
     */
    public ListSitesResponse listSitesWithOptions(ListSitesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSitesShrinkRequest request = new ListSitesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagFilter)) {
            request.tagFilterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagFilter, "TagFilter", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSites"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSitesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about websites in your account, such as the name, status, and configuration of each website.</p>
     * 
     * @param request ListSitesRequest
     * @return ListSitesResponse
     */
    public ListSitesResponse listSites(ListSitesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSitesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tags based on the region ID and resource type.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxItem)) {
            query.put("MaxItem", request.maxItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tags based on the region ID and resource type.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status and running information of file upload tasks based on the task time and type.</p>
     * 
     * @param request ListUploadTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUploadTasksResponse
     */
    public ListUploadTasksResponse listUploadTasksWithOptions(ListUploadTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUploadTasks"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUploadTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status and running information of file upload tasks based on the task time and type.</p>
     * 
     * @param request ListUploadTasksRequest
     * @return ListUploadTasksResponse
     */
    public ListUploadTasksResponse listUploadTasks(ListUploadTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUploadTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all delivery tasks in your Alibaba Cloud account by page. You can filter the delivery tasks by the category of the delivered real-time logs.</p>
     * 
     * @param request ListUserDeliveryTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserDeliveryTasksResponse
     */
    public ListUserDeliveryTasksResponse listUserDeliveryTasksWithOptions(ListUserDeliveryTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserDeliveryTasks"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserDeliveryTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all delivery tasks in your Alibaba Cloud account by page. You can filter the delivery tasks by the category of the delivered real-time logs.</p>
     * 
     * @param request ListUserDeliveryTasksRequest
     * @return ListUserDeliveryTasksResponse
     */
    public ListUserDeliveryTasksResponse listUserDeliveryTasks(ListUserDeliveryTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserDeliveryTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the plans that you purchased and the details of the plans.</p>
     * 
     * @param request ListUserRatePlanInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserRatePlanInstancesResponse
     */
    public ListUserRatePlanInstancesResponse listUserRatePlanInstancesWithOptions(ListUserRatePlanInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserRatePlanInstances"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserRatePlanInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the plans that you purchased and the details of the plans.</p>
     * 
     * @param request ListUserRatePlanInstancesRequest
     * @return ListUserRatePlanInstancesResponse
     */
    public ListUserRatePlanInstancesResponse listUserRatePlanInstances(ListUserRatePlanInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserRatePlanInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户的Routine列表</p>
     * 
     * @param request ListUserRoutinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserRoutinesResponse
     */
    public ListUserRoutinesResponse listUserRoutinesWithOptions(ListUserRoutinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyWord)) {
            query.put("SearchKeyWord", request.searchKeyWord);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserRoutines"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserRoutinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户的Routine列表</p>
     * 
     * @param request ListUserRoutinesRequest
     * @return ListUserRoutinesResponse
     */
    public ListUserRoutinesResponse listUserRoutines(ListUserRoutinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserRoutinesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点视频处理配置列表</p>
     * 
     * @param request ListVideoProcessingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVideoProcessingsResponse
     */
    public ListVideoProcessingsResponse listVideoProcessingsWithOptions(ListVideoProcessingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("ConfigType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVideoProcessings"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVideoProcessingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点视频处理配置列表</p>
     * 
     * @param request ListVideoProcessingsRequest
     * @return ListVideoProcessingsResponse
     */
    public ListVideoProcessingsResponse listVideoProcessings(ListVideoProcessingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVideoProcessingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Managed Rules</p>
     * 
     * @param tmpReq ListWafManagedRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafManagedRulesResponse
     */
    public ListWafManagedRulesResponse listWafManagedRulesWithOptions(ListWafManagedRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWafManagedRulesShrinkRequest request = new ListWafManagedRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attackType)) {
            query.put("AttackType", request.attackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionLevel)) {
            query.put("ProtectionLevel", request.protectionLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafManagedRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafManagedRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Managed Rules</p>
     * 
     * @param request ListWafManagedRulesRequest
     * @return ListWafManagedRulesResponse
     */
    public ListWafManagedRulesResponse listWafManagedRules(ListWafManagedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafManagedRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Phases</p>
     * 
     * @param request ListWafPhasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafPhasesResponse
     */
    public ListWafPhasesResponse listWafPhasesWithOptions(ListWafPhasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafPhases"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafPhasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Phases</p>
     * 
     * @param request ListWafPhasesRequest
     * @return ListWafPhasesResponse
     */
    public ListWafPhasesResponse listWafPhases(ListWafPhasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafPhasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Rules</p>
     * 
     * @param tmpReq ListWafRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafRulesResponse
     */
    public ListWafRulesResponse listWafRulesWithOptions(ListWafRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWafRulesShrinkRequest request = new ListWafRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesetId)) {
            query.put("RulesetId", request.rulesetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Rules</p>
     * 
     * @param request ListWafRulesRequest
     * @return ListWafRulesResponse
     */
    public ListWafRulesResponse listWafRules(ListWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Rule Sets</p>
     * 
     * @param tmpReq ListWafRulesetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafRulesetsResponse
     */
    public ListWafRulesetsResponse listWafRulesetsWithOptions(ListWafRulesetsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWafRulesetsShrinkRequest request = new ListWafRulesetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafRulesets"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafRulesetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Rule Sets</p>
     * 
     * @param request ListWafRulesetsRequest
     * @return ListWafRulesetsResponse
     */
    public ListWafRulesetsResponse listWafRulesets(ListWafRulesetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafRulesetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Template Rules</p>
     * 
     * @param tmpReq ListWafTemplateRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafTemplateRulesResponse
     */
    public ListWafTemplateRulesResponse listWafTemplateRulesWithOptions(ListWafTemplateRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWafTemplateRulesShrinkRequest request = new ListWafTemplateRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafTemplateRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafTemplateRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Template Rules</p>
     * 
     * @param request ListWafTemplateRulesRequest
     * @return ListWafTemplateRulesResponse
     */
    public ListWafTemplateRulesResponse listWafTemplateRules(ListWafTemplateRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafTemplateRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Rule Usage</p>
     * 
     * @param request ListWafUsageOfRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafUsageOfRulesResponse
     */
    public ListWafUsageOfRulesResponse listWafUsageOfRulesWithOptions(ListWafUsageOfRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafUsageOfRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafUsageOfRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List WAF Rule Usage</p>
     * 
     * @param request ListWafUsageOfRulesRequest
     * @return ListWafUsageOfRulesResponse
     */
    public ListWafUsageOfRulesResponse listWafUsageOfRules(ListWafUsageOfRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafUsageOfRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query details of all waiting room events related to a waiting room in a website.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about waiting room events for a waiting room.</p>
     * 
     * @param request ListWaitingRoomEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWaitingRoomEventsResponse
     */
    public ListWaitingRoomEventsResponse listWaitingRoomEventsWithOptions(ListWaitingRoomEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWaitingRoomEvents"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWaitingRoomEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query details of all waiting room events related to a waiting room in a website.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about waiting room events for a waiting room.</p>
     * 
     * @param request ListWaitingRoomEventsRequest
     * @return ListWaitingRoomEventsResponse
     */
    public ListWaitingRoomEventsResponse listWaitingRoomEvents(ListWaitingRoomEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWaitingRoomEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API allows users to query the list of waiting room bypass rules associated with a specific site.</p>
     * 
     * <b>summary</b> : 
     * <p>Query Waiting Room Bypass Rules</p>
     * 
     * @param request ListWaitingRoomRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWaitingRoomRulesResponse
     */
    public ListWaitingRoomRulesResponse listWaitingRoomRulesWithOptions(ListWaitingRoomRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWaitingRoomRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWaitingRoomRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API allows users to query the list of waiting room bypass rules associated with a specific site.</p>
     * 
     * <b>summary</b> : 
     * <p>Query Waiting Room Bypass Rules</p>
     * 
     * @param request ListWaitingRoomRulesRequest
     * @return ListWaitingRoomRulesResponse
     */
    public ListWaitingRoomRulesResponse listWaitingRoomRules(ListWaitingRoomRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWaitingRoomRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query detailed configurations about all waiting rooms in a website, including the status, name, and queuing rules of each waiting room.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about all waiting rooms in a website.</p>
     * 
     * @param request ListWaitingRoomsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWaitingRoomsResponse
     */
    public ListWaitingRoomsResponse listWaitingRoomsWithOptions(ListWaitingRoomsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWaitingRooms"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWaitingRoomsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query detailed configurations about all waiting rooms in a website, including the status, name, and queuing rules of each waiting room.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about all waiting rooms in a website.</p>
     * 
     * @param request ListWaitingRoomsRequest
     * @return ListWaitingRoomsResponse
     */
    public ListWaitingRoomsResponse listWaitingRooms(ListWaitingRoomsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWaitingRoomsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>OpenErService</p>
     * 
     * @param request OpenErServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenErServiceResponse
     */
    public OpenErServiceResponse openErServiceWithOptions(OpenErServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenErService"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenErServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>OpenErService</p>
     * 
     * @param request OpenErServiceRequest
     * @return OpenErServiceResponse
     */
    public OpenErServiceResponse openErService(OpenErServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openErServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Prefetches cache.</p>
     * 
     * @param tmpReq PreloadCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreloadCachesResponse
     */
    public PreloadCachesResponse preloadCachesWithOptions(PreloadCachesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PreloadCachesShrinkRequest request = new PreloadCachesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.headers)) {
            request.headersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.headers, "Headers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headersShrink)) {
            query.put("Headers", request.headersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreloadCaches"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreloadCachesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Prefetches cache.</p>
     * 
     * @param request PreloadCachesRequest
     * @return PreloadCachesResponse
     */
    public PreloadCachesResponse preloadCaches(PreloadCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadCachesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a specific version of a containerized application. You can call this operation to iterate an application.</p>
     * 
     * @param tmpReq PublishEdgeContainerAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishEdgeContainerAppVersionResponse
     */
    public PublishEdgeContainerAppVersionResponse publishEdgeContainerAppVersionWithOptions(PublishEdgeContainerAppVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PublishEdgeContainerAppVersionShrinkRequest request = new PublishEdgeContainerAppVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regions)) {
            request.regionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regions, "Regions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fullRelease)) {
            query.put("FullRelease", request.fullRelease);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishType)) {
            query.put("PublishType", request.publishType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionsShrink)) {
            query.put("Regions", request.regionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.percentage)) {
            body.put("Percentage", request.percentage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishEnv)) {
            body.put("PublishEnv", request.publishEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishEdgeContainerAppVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishEdgeContainerAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a specific version of a containerized application. You can call this operation to iterate an application.</p>
     * 
     * @param request PublishEdgeContainerAppVersionRequest
     * @return PublishEdgeContainerAppVersionResponse
     */
    public PublishEdgeContainerAppVersionResponse publishEdgeContainerAppVersion(PublishEdgeContainerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishEdgeContainerAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a code version of a routine to the staging, canary, or production environment. You can specify the regions where the canary environment is deployed to release your code.</p>
     * 
     * @param request PublishRoutineCodeVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishRoutineCodeVersionResponse
     */
    public PublishRoutineCodeVersionResponse publishRoutineCodeVersionWithOptions(PublishRoutineCodeVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeVersion)) {
            body.put("CodeVersion", request.codeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishRoutineCodeVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRoutineCodeVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a code version of a routine to the staging, canary, or production environment. You can specify the regions where the canary environment is deployed to release your code.</p>
     * 
     * @param request PublishRoutineCodeVersionRequest
     * @return PublishRoutineCodeVersionResponse
     */
    public PublishRoutineCodeVersionResponse publishRoutineCodeVersion(PublishRoutineCodeVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishRoutineCodeVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>New Purchase of Cache Retention</p>
     * 
     * @param request PurchaseCacheReserveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PurchaseCacheReserveResponse
     */
    public PurchaseCacheReserveResponse purchaseCacheReserveWithOptions(PurchaseCacheReserveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crRegion)) {
            query.put("CrRegion", request.crRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaGb)) {
            query.put("QuotaGb", request.quotaGb);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PurchaseCacheReserve"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PurchaseCacheReserveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>New Purchase of Cache Retention</p>
     * 
     * @param request PurchaseCacheReserveRequest
     * @return PurchaseCacheReserveResponse
     */
    public PurchaseCacheReserveResponse purchaseCacheReserve(PurchaseCacheReserveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.purchaseCacheReserveWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>The package name and code can be obtained from the DescribeRatePlanPrice interface.</li>
     * <li>If the acceleration area is not overseas, the site must have successfully completed the filing process.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Purchase New Package</p>
     * 
     * @param request PurchaseRatePlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PurchaseRatePlanResponse
     */
    public PurchaseRatePlanResponse purchaseRatePlanWithOptions(PurchaseRatePlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverage)) {
            query.put("Coverage", request.coverage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planCode)) {
            query.put("PlanCode", request.planCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            query.put("PlanName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteName)) {
            query.put("SiteName", request.siteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PurchaseRatePlan"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PurchaseRatePlanResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>The package name and code can be obtained from the DescribeRatePlanPrice interface.</li>
     * <li>If the acceleration area is not overseas, the site must have successfully completed the filing process.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Purchase New Package</p>
     * 
     * @param request PurchaseRatePlanRequest
     * @return PurchaseRatePlanResponse
     */
    public PurchaseRatePlanResponse purchaseRatePlan(PurchaseRatePlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.purchaseRatePlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cache Refresh</p>
     * 
     * @param tmpReq PurgeCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PurgeCachesResponse
     */
    public PurgeCachesResponse purgeCachesWithOptions(PurgeCachesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PurgeCachesShrinkRequest request = new PurgeCachesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgeComputePurge)) {
            query.put("EdgeComputePurge", request.edgeComputePurge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PurgeCaches"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PurgeCachesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cache Refresh</p>
     * 
     * @param request PurgeCachesRequest
     * @return PurgeCachesResponse
     */
    public PurgeCachesResponse purgeCaches(PurgeCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.purgeCachesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a key-value pair for a namespace. The request body can be up to 2 MB.</p>
     * 
     * @param request PutKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutKvResponse
     */
    public PutKvResponse putKvWithOptions(PutKvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.base64)) {
            query.put("Base64", request.base64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTtl)) {
            query.put("ExpirationTtl", request.expirationTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutKv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a key-value pair for a namespace. The request body can be up to 2 MB.</p>
     * 
     * @param request PutKvRequest
     * @return PutKvResponse
     */
    public PutKvResponse putKv(PutKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putKvWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to upload a larger request body than by using <a href="~~PutKv~~">PutKv</a>. For small request bodies, we recommend that you use <a href="~~PutKv~~">PutKv</a> to minimize the server processing time. This operation must be called by using SDKs. The following sample code uses the Golang SDK and PutKvWithHighCapacityAdvance to call the operation.
     *     func TestPutKvWithHighCapacity() {
     *         // Initialize the configurations.
     *         cfg := new(openapi.Config)
     *         cfg.SetAccessKeyId(&quot;xxxxxxxxx&quot;)
     *         cfg.SetAccessKeySecret(&quot;xxxxxxxxxx&quot;)
     *         cli, err := NewClient(cfg)
     *         if err != nil {
     *             return err
     *         }
     *         runtime := &amp;util.RuntimeOptions{}
     *         // Construct a request for uploading key-value pairs.
     *         namespace := &quot;test-put-kv&quot;
     *         key := &quot;test_PutKvWithHighCapacity_0&quot;
     *         value := strings.Repeat(&quot;t&quot;, 10<em>1024</em>1024)
     *         rawReq := &amp;PutKvRequest{
     *             Namespace: &amp;namespace,
     *             Key:       &amp;key,
     *             Value:     &amp;value,
     *         }
     *         payload, err := json.Marshal(rawReq)
     *         if err != nil {
     *             return err
     *         }
     *         // If the payload is greater than 2 MB, call the PutKvWithHighCapacity operation for upload.
     *         reqHighCapacity := &amp;PutKvWithHighCapacityAdvanceRequest{
     *             Namespace: &amp;namespace,
     *             Key:       &amp;key,
     *             UrlObject: bytes.NewReader([]byte(payload)),
     *         }
     *         resp, err := cli.PutKvWithHighCapacityAdvance(reqHighCapacity, runtime)
     *         if err != nil {
     *             return err
     *         }
     *         return nil
     *     }</p>
     * 
     * <b>summary</b> : 
     * <p>Configures a large key-value pair for a namespace. The request body can be up to 25 MB.</p>
     * 
     * @param request PutKvWithHighCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutKvWithHighCapacityResponse
     */
    public PutKvWithHighCapacityResponse putKvWithHighCapacityWithOptions(PutKvWithHighCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutKvWithHighCapacity"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutKvWithHighCapacityResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to upload a larger request body than by using <a href="~~PutKv~~">PutKv</a>. For small request bodies, we recommend that you use <a href="~~PutKv~~">PutKv</a> to minimize the server processing time. This operation must be called by using SDKs. The following sample code uses the Golang SDK and PutKvWithHighCapacityAdvance to call the operation.
     *     func TestPutKvWithHighCapacity() {
     *         // Initialize the configurations.
     *         cfg := new(openapi.Config)
     *         cfg.SetAccessKeyId(&quot;xxxxxxxxx&quot;)
     *         cfg.SetAccessKeySecret(&quot;xxxxxxxxxx&quot;)
     *         cli, err := NewClient(cfg)
     *         if err != nil {
     *             return err
     *         }
     *         runtime := &amp;util.RuntimeOptions{}
     *         // Construct a request for uploading key-value pairs.
     *         namespace := &quot;test-put-kv&quot;
     *         key := &quot;test_PutKvWithHighCapacity_0&quot;
     *         value := strings.Repeat(&quot;t&quot;, 10<em>1024</em>1024)
     *         rawReq := &amp;PutKvRequest{
     *             Namespace: &amp;namespace,
     *             Key:       &amp;key,
     *             Value:     &amp;value,
     *         }
     *         payload, err := json.Marshal(rawReq)
     *         if err != nil {
     *             return err
     *         }
     *         // If the payload is greater than 2 MB, call the PutKvWithHighCapacity operation for upload.
     *         reqHighCapacity := &amp;PutKvWithHighCapacityAdvanceRequest{
     *             Namespace: &amp;namespace,
     *             Key:       &amp;key,
     *             UrlObject: bytes.NewReader([]byte(payload)),
     *         }
     *         resp, err := cli.PutKvWithHighCapacityAdvance(reqHighCapacity, runtime)
     *         if err != nil {
     *             return err
     *         }
     *         return nil
     *     }</p>
     * 
     * <b>summary</b> : 
     * <p>Configures a large key-value pair for a namespace. The request body can be up to 25 MB.</p>
     * 
     * @param request PutKvWithHighCapacityRequest
     * @return PutKvWithHighCapacityResponse
     */
    public PutKvWithHighCapacityResponse putKvWithHighCapacity(PutKvWithHighCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putKvWithHighCapacityWithOptions(request, runtime);
    }

    public PutKvWithHighCapacityResponse putKvWithHighCapacityAdvance(PutKvWithHighCapacityAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "ESA"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        PutKvWithHighCapacityRequest putKvWithHighCapacityReq = new PutKvWithHighCapacityRequest();
        com.aliyun.openapiutil.Client.convert(request, putKvWithHighCapacityReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            putKvWithHighCapacityReq.url = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        PutKvWithHighCapacityResponse putKvWithHighCapacityResp = this.putKvWithHighCapacityWithOptions(putKvWithHighCapacityReq, runtime);
        return putKvWithHighCapacityResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Rebuilds the staging environment for containerized applications.</p>
     * 
     * @param request RebuildEdgeContainerAppStagingEnvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebuildEdgeContainerAppStagingEnvResponse
     */
    public RebuildEdgeContainerAppStagingEnvResponse rebuildEdgeContainerAppStagingEnvWithOptions(RebuildEdgeContainerAppStagingEnvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebuildEdgeContainerAppStagingEnv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebuildEdgeContainerAppStagingEnvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rebuilds the staging environment for containerized applications.</p>
     * 
     * @param request RebuildEdgeContainerAppStagingEnvRequest
     * @return RebuildEdgeContainerAppStagingEnvResponse
     */
    public RebuildEdgeContainerAppStagingEnvResponse rebuildEdgeContainerAppStagingEnv(RebuildEdgeContainerAppStagingEnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebuildEdgeContainerAppStagingEnvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the progress of a scheduled prefetch task and starts the prefetch from the beginning.</p>
     * 
     * @param request ResetScheduledPreloadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetScheduledPreloadJobResponse
     */
    public ResetScheduledPreloadJobResponse resetScheduledPreloadJobWithOptions(ResetScheduledPreloadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetScheduledPreloadJob"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetScheduledPreloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the progress of a scheduled prefetch task and starts the prefetch from the beginning.</p>
     * 
     * @param request ResetScheduledPreloadJobRequest
     * @return ResetScheduledPreloadJobResponse
     */
    public ResetScheduledPreloadJobResponse resetScheduledPreloadJob(ResetScheduledPreloadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetScheduledPreloadJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes an activated client certificate.</p>
     * 
     * @param request RevokeClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeClientCertificateResponse
     */
    public RevokeClientCertificateResponse revokeClientCertificateWithOptions(RevokeClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes an activated client certificate.</p>
     * 
     * @param request RevokeClientCertificateRequest
     * @return RevokeClientCertificateResponse
     */
    public RevokeClientCertificateResponse revokeClientCertificate(RevokeClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back a version of a containerized application.</p>
     * 
     * @param request RollbackEdgeContainerAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackEdgeContainerAppVersionResponse
     */
    public RollbackEdgeContainerAppVersionResponse rollbackEdgeContainerAppVersionWithOptions(RollbackEdgeContainerAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.percentage)) {
            query.put("Percentage", request.percentage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedPercent)) {
            query.put("UsedPercent", request.usedPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackEdgeContainerAppVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackEdgeContainerAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back a version of a containerized application.</p>
     * 
     * @param request RollbackEdgeContainerAppVersionRequest
     * @return RollbackEdgeContainerAppVersionResponse
     */
    public RollbackEdgeContainerAppVersionResponse rollbackEdgeContainerAppVersion(RollbackEdgeContainerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackEdgeContainerAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures whether to enable certificates and update certificate information for a website.</p>
     * 
     * @param request SetCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCertificateResponse
     */
    public SetCertificateResponse setCertificateWithOptions(SetCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.casId)) {
            body.put("CasId", request.casId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificate)) {
            body.put("Certificate", request.certificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            body.put("PrivateKey", request.privateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures whether to enable certificates and update certificate information for a website.</p>
     * 
     * @param request SetCertificateRequest
     * @return SetCertificateResponse
     */
    public SetCertificateResponse setCertificate(SetCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates domain names with a client CA certificate. If no certificate is specified, domain names are associated with an Edge Security Acceleration (ESA)-managed CA certificate.</p>
     * 
     * @param tmpReq SetClientCertificateHostnamesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetClientCertificateHostnamesResponse
     */
    public SetClientCertificateHostnamesResponse setClientCertificateHostnamesWithOptions(SetClientCertificateHostnamesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetClientCertificateHostnamesShrinkRequest request = new SetClientCertificateHostnamesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hostnames)) {
            request.hostnamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hostnames, "Hostnames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostnamesShrink)) {
            body.put("Hostnames", request.hostnamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetClientCertificateHostnames"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetClientCertificateHostnamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates domain names with a client CA certificate. If no certificate is specified, domain names are associated with an Edge Security Acceleration (ESA)-managed CA certificate.</p>
     * 
     * @param request SetClientCertificateHostnamesRequest
     * @return SetClientCertificateHostnamesResponse
     */
    public SetClientCertificateHostnamesResponse setClientCertificateHostnames(SetClientCertificateHostnamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setClientCertificateHostnamesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures smart HTTP DDoS protection.</p>
     * 
     * @param request SetHttpDDoSAttackIntelligentProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetHttpDDoSAttackIntelligentProtectionResponse
     */
    public SetHttpDDoSAttackIntelligentProtectionResponse setHttpDDoSAttackIntelligentProtectionWithOptions(SetHttpDDoSAttackIntelligentProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aiMode)) {
            query.put("AiMode", request.aiMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aiTemplate)) {
            query.put("AiTemplate", request.aiTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetHttpDDoSAttackIntelligentProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetHttpDDoSAttackIntelligentProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures smart HTTP DDoS protection.</p>
     * 
     * @param request SetHttpDDoSAttackIntelligentProtectionRequest
     * @return SetHttpDDoSAttackIntelligentProtectionResponse
     */
    public SetHttpDDoSAttackIntelligentProtectionResponse setHttpDDoSAttackIntelligentProtection(SetHttpDDoSAttackIntelligentProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setHttpDDoSAttackIntelligentProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures HTTP DDoS attack protection for a website.</p>
     * 
     * @param request SetHttpDDoSAttackProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetHttpDDoSAttackProtectionResponse
     */
    public SetHttpDDoSAttackProtectionResponse setHttpDDoSAttackProtectionWithOptions(SetHttpDDoSAttackProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalMode)) {
            query.put("GlobalMode", request.globalMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetHttpDDoSAttackProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetHttpDDoSAttackProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures HTTP DDoS attack protection for a website.</p>
     * 
     * @param request SetHttpDDoSAttackProtectionRequest
     * @return SetHttpDDoSAttackProtectionResponse
     */
    public SetHttpDDoSAttackProtectionResponse setHttpDDoSAttackProtection(SetHttpDDoSAttackProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setHttpDDoSAttackProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为域名回源客户端证书绑定域名</p>
     * 
     * @param tmpReq SetOriginClientCertificateHostnamesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetOriginClientCertificateHostnamesResponse
     */
    public SetOriginClientCertificateHostnamesResponse setOriginClientCertificateHostnamesWithOptions(SetOriginClientCertificateHostnamesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetOriginClientCertificateHostnamesShrinkRequest request = new SetOriginClientCertificateHostnamesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hostnames)) {
            request.hostnamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hostnames, "Hostnames", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostnamesShrink)) {
            body.put("Hostnames", request.hostnamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetOriginClientCertificateHostnames"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetOriginClientCertificateHostnamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为域名回源客户端证书绑定域名</p>
     * 
     * @param request SetOriginClientCertificateHostnamesRequest
     * @return SetOriginClientCertificateHostnamesResponse
     */
    public SetOriginClientCertificateHostnamesResponse setOriginClientCertificateHostnames(SetOriginClientCertificateHostnamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setOriginClientCertificateHostnamesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a scheduled prefetch plan based on the plan ID.</p>
     * 
     * @param request StartScheduledPreloadExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartScheduledPreloadExecutionResponse
     */
    public StartScheduledPreloadExecutionResponse startScheduledPreloadExecutionWithOptions(StartScheduledPreloadExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartScheduledPreloadExecution"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartScheduledPreloadExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a scheduled prefetch plan based on the plan ID.</p>
     * 
     * @param request StartScheduledPreloadExecutionRequest
     * @return StartScheduledPreloadExecutionResponse
     */
    public StartScheduledPreloadExecutionResponse startScheduledPreloadExecution(StartScheduledPreloadExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startScheduledPreloadExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a scheduled prefetch plan based on the plan ID.</p>
     * 
     * @param request StopScheduledPreloadExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopScheduledPreloadExecutionResponse
     */
    public StopScheduledPreloadExecutionResponse stopScheduledPreloadExecutionWithOptions(StopScheduledPreloadExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopScheduledPreloadExecution"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopScheduledPreloadExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a scheduled prefetch plan based on the plan ID.</p>
     * 
     * @param request StopScheduledPreloadExecutionRequest
     * @return StopScheduledPreloadExecutionResponse
     */
    public StopScheduledPreloadExecutionResponse stopScheduledPreloadExecution(StopScheduledPreloadExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopScheduledPreloadExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a resource tag based on a specified resource ID.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a resource tag based on a specified resource ID.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>缓存保持变配</p>
     * 
     * @param request UpdateCacheReserveSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCacheReserveSpecResponse
     */
    public UpdateCacheReserveSpecResponse updateCacheReserveSpecWithOptions(UpdateCacheReserveSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetQuotaGb)) {
            query.put("TargetQuotaGb", request.targetQuotaGb);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCacheReserveSpec"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCacheReserveSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>缓存保持变配</p>
     * 
     * @param request UpdateCacheReserveSpecRequest
     * @return UpdateCacheReserveSpecResponse
     */
    public UpdateCacheReserveSpecResponse updateCacheReserveSpec(UpdateCacheReserveSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCacheReserveSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify cache configuration</p>
     * 
     * @param request UpdateCacheRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCacheRuleResponse
     */
    public UpdateCacheRuleResponse updateCacheRuleWithOptions(UpdateCacheRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalCacheablePorts)) {
            query.put("AdditionalCacheablePorts", request.additionalCacheablePorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserCacheMode)) {
            query.put("BrowserCacheMode", request.browserCacheMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserCacheTtl)) {
            query.put("BrowserCacheTtl", request.browserCacheTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bypassCache)) {
            query.put("BypassCache", request.bypassCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cacheDeceptionArmor)) {
            query.put("CacheDeceptionArmor", request.cacheDeceptionArmor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cacheReserveEligibility)) {
            query.put("CacheReserveEligibility", request.cacheReserveEligibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkPresenceCookie)) {
            query.put("CheckPresenceCookie", request.checkPresenceCookie);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkPresenceHeader)) {
            query.put("CheckPresenceHeader", request.checkPresenceHeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgeCacheMode)) {
            query.put("EdgeCacheMode", request.edgeCacheMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgeCacheTtl)) {
            query.put("EdgeCacheTtl", request.edgeCacheTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgeStatusCodeCacheTtl)) {
            query.put("EdgeStatusCodeCacheTtl", request.edgeStatusCodeCacheTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeCookie)) {
            query.put("IncludeCookie", request.includeCookie);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeHeader)) {
            query.put("IncludeHeader", request.includeHeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryString)) {
            query.put("QueryString", request.queryString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStringMode)) {
            query.put("QueryStringMode", request.queryStringMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serveStale)) {
            query.put("ServeStale", request.serveStale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortQueryStringForCache)) {
            query.put("SortQueryStringForCache", request.sortQueryStringForCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDeviceType)) {
            query.put("UserDeviceType", request.userDeviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGeo)) {
            query.put("UserGeo", request.userGeo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userLanguage)) {
            query.put("UserLanguage", request.userLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCacheRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCacheRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify cache configuration</p>
     * 
     * @param request UpdateCacheRuleRequest
     * @return UpdateCacheRuleResponse
     */
    public UpdateCacheRuleResponse updateCacheRule(UpdateCacheRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCacheRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the cache tag configuration of your website. You can call this operation when you need to specify tags in the Cache-Tag response header to use the purge by cache tag feature.</p>
     * 
     * @param request UpdateCacheTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCacheTagResponse
     */
    public UpdateCacheTagResponse updateCacheTagWithOptions(UpdateCacheTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caseInsensitive)) {
            query.put("CaseInsensitive", request.caseInsensitive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCacheTag"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCacheTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the cache tag configuration of your website. You can call this operation when you need to specify tags in the Cache-Tag response header to use the purge by cache tag feature.</p>
     * 
     * @param request UpdateCacheTagRequest
     * @return UpdateCacheTagResponse
     */
    public UpdateCacheTagResponse updateCacheTag(UpdateCacheTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCacheTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the CNAME flattening configuration of a website.</p>
     * 
     * @param request UpdateCnameFlatteningRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCnameFlatteningResponse
     */
    public UpdateCnameFlatteningResponse updateCnameFlatteningWithOptions(UpdateCnameFlatteningRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flattenMode)) {
            query.put("FlattenMode", request.flattenMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCnameFlattening"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCnameFlatteningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the CNAME flattening configuration of a website.</p>
     * 
     * @param request UpdateCnameFlatteningRequest
     * @return UpdateCnameFlatteningResponse
     */
    public UpdateCnameFlatteningResponse updateCnameFlattening(UpdateCnameFlatteningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCnameFlatteningWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify compression rule</p>
     * 
     * @param request UpdateCompressionRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCompressionRuleResponse
     */
    public UpdateCompressionRuleResponse updateCompressionRuleWithOptions(UpdateCompressionRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brotli)) {
            query.put("Brotli", request.brotli);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gzip)) {
            query.put("Gzip", request.gzip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zstd)) {
            query.put("Zstd", request.zstd);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCompressionRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCompressionRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify compression rule</p>
     * 
     * @param request UpdateCompressionRuleRequest
     * @return UpdateCompressionRuleResponse
     */
    public UpdateCompressionRuleResponse updateCompressionRule(UpdateCompressionRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCompressionRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点中国大陆网络接入优化配置</p>
     * 
     * @param request UpdateCrossBorderOptimizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCrossBorderOptimizationResponse
     */
    public UpdateCrossBorderOptimizationResponse updateCrossBorderOptimizationWithOptions(UpdateCrossBorderOptimizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCrossBorderOptimization"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCrossBorderOptimizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点中国大陆网络接入优化配置</p>
     * 
     * @param request UpdateCrossBorderOptimizationRequest
     * @return UpdateCrossBorderOptimizationResponse
     */
    public UpdateCrossBorderOptimizationResponse updateCrossBorderOptimization(UpdateCrossBorderOptimizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCrossBorderOptimizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a custom scenario-specific policy.</p>
     * 
     * @param request UpdateCustomScenePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomScenePolicyResponse
     */
    public UpdateCustomScenePolicyResponse updateCustomScenePolicyWithOptions(UpdateCustomScenePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objects)) {
            query.put("Objects", request.objects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteIds)) {
            query.put("SiteIds", request.siteIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomScenePolicy"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomScenePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a custom scenario-specific policy.</p>
     * 
     * @param request UpdateCustomScenePolicyRequest
     * @return UpdateCustomScenePolicyResponse
     */
    public UpdateCustomScenePolicyResponse updateCustomScenePolicy(UpdateCustomScenePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomScenePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the development mode configuration of your website. If you enable Development Mode, all requests bypass caching components on POPs and are redirected to the origin server. This allows clients to retrieve the most recent resources on the origin server.</p>
     * 
     * @param request UpdateDevelopmentModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDevelopmentModeResponse
     */
    public UpdateDevelopmentModeResponse updateDevelopmentModeWithOptions(UpdateDevelopmentModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDevelopmentMode"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDevelopmentModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the development mode configuration of your website. If you enable Development Mode, all requests bypass caching components on POPs and are redirected to the origin server. This allows clients to retrieve the most recent resources on the origin server.</p>
     * 
     * @param request UpdateDevelopmentModeRequest
     * @return UpdateDevelopmentModeResponse
     */
    public UpdateDevelopmentModeResponse updateDevelopmentMode(UpdateDevelopmentModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDevelopmentModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the log collection configuration of a containerized application.</p>
     * 
     * @param request UpdateEdgeContainerAppLogRiverRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEdgeContainerAppLogRiverResponse
     */
    public UpdateEdgeContainerAppLogRiverResponse updateEdgeContainerAppLogRiverWithOptions(UpdateEdgeContainerAppLogRiverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stdout)) {
            query.put("Stdout", request.stdout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEdgeContainerAppLogRiver"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEdgeContainerAppLogRiverResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the log collection configuration of a containerized application.</p>
     * 
     * @param request UpdateEdgeContainerAppLogRiverRequest
     * @return UpdateEdgeContainerAppLogRiverResponse
     */
    public UpdateEdgeContainerAppLogRiverResponse updateEdgeContainerAppLogRiver(UpdateEdgeContainerAppLogRiverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEdgeContainerAppLogRiverWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新边缘容器资源预留配置</p>
     * 
     * @param tmpReq UpdateEdgeContainerAppResourceReserveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEdgeContainerAppResourceReserveResponse
     */
    public UpdateEdgeContainerAppResourceReserveResponse updateEdgeContainerAppResourceReserveWithOptions(UpdateEdgeContainerAppResourceReserveRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEdgeContainerAppResourceReserveShrinkRequest request = new UpdateEdgeContainerAppResourceReserveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reserveSet)) {
            request.reserveSetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reserveSet, "ReserveSet", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.durationTime)) {
            query.put("DurationTime", request.durationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forever)) {
            query.put("Forever", request.forever);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserveSetShrink)) {
            query.put("ReserveSet", request.reserveSetShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEdgeContainerAppResourceReserve"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEdgeContainerAppResourceReserveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新边缘容器资源预留配置</p>
     * 
     * @param request UpdateEdgeContainerAppResourceReserveRequest
     * @return UpdateEdgeContainerAppResourceReserveResponse
     */
    public UpdateEdgeContainerAppResourceReserveResponse updateEdgeContainerAppResourceReserve(UpdateEdgeContainerAppResourceReserveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEdgeContainerAppResourceReserveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify HTTP Request Header Rules</p>
     * 
     * @param tmpReq UpdateHttpRequestHeaderModificationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHttpRequestHeaderModificationRuleResponse
     */
    public UpdateHttpRequestHeaderModificationRuleResponse updateHttpRequestHeaderModificationRuleWithOptions(UpdateHttpRequestHeaderModificationRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateHttpRequestHeaderModificationRuleShrinkRequest request = new UpdateHttpRequestHeaderModificationRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.requestHeaderModification)) {
            request.requestHeaderModificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.requestHeaderModification, "RequestHeaderModification", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestHeaderModificationShrink)) {
            query.put("RequestHeaderModification", request.requestHeaderModificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHttpRequestHeaderModificationRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHttpRequestHeaderModificationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify HTTP Request Header Rules</p>
     * 
     * @param request UpdateHttpRequestHeaderModificationRuleRequest
     * @return UpdateHttpRequestHeaderModificationRuleResponse
     */
    public UpdateHttpRequestHeaderModificationRuleResponse updateHttpRequestHeaderModificationRule(UpdateHttpRequestHeaderModificationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHttpRequestHeaderModificationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify HTTP response header rules</p>
     * 
     * @param tmpReq UpdateHttpResponseHeaderModificationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHttpResponseHeaderModificationRuleResponse
     */
    public UpdateHttpResponseHeaderModificationRuleResponse updateHttpResponseHeaderModificationRuleWithOptions(UpdateHttpResponseHeaderModificationRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateHttpResponseHeaderModificationRuleShrinkRequest request = new UpdateHttpResponseHeaderModificationRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.responseHeaderModification)) {
            request.responseHeaderModificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.responseHeaderModification, "ResponseHeaderModification", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseHeaderModificationShrink)) {
            query.put("ResponseHeaderModification", request.responseHeaderModificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHttpResponseHeaderModificationRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHttpResponseHeaderModificationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify HTTP response header rules</p>
     * 
     * @param request UpdateHttpResponseHeaderModificationRuleRequest
     * @return UpdateHttpResponseHeaderModificationRuleResponse
     */
    public UpdateHttpResponseHeaderModificationRuleResponse updateHttpResponseHeaderModificationRule(UpdateHttpResponseHeaderModificationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHttpResponseHeaderModificationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify HTTPS Application Configuration</p>
     * 
     * @param request UpdateHttpsApplicationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHttpsApplicationConfigurationResponse
     */
    public UpdateHttpsApplicationConfigurationResponse updateHttpsApplicationConfigurationWithOptions(UpdateHttpsApplicationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.altSvc)) {
            query.put("AltSvc", request.altSvc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.altSvcClear)) {
            query.put("AltSvcClear", request.altSvcClear);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.altSvcMa)) {
            query.put("AltSvcMa", request.altSvcMa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.altSvcPersist)) {
            query.put("AltSvcPersist", request.altSvcPersist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hsts)) {
            query.put("Hsts", request.hsts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hstsIncludeSubdomains)) {
            query.put("HstsIncludeSubdomains", request.hstsIncludeSubdomains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hstsMaxAge)) {
            query.put("HstsMaxAge", request.hstsMaxAge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hstsPreload)) {
            query.put("HstsPreload", request.hstsPreload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsForce)) {
            query.put("HttpsForce", request.httpsForce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsForceCode)) {
            query.put("HttpsForceCode", request.httpsForceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsNoSniDeny)) {
            query.put("HttpsNoSniDeny", request.httpsNoSniDeny);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsSniVerify)) {
            query.put("HttpsSniVerify", request.httpsSniVerify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsSniWhitelist)) {
            query.put("HttpsSniWhitelist", request.httpsSniWhitelist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHttpsApplicationConfiguration"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHttpsApplicationConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify HTTPS Application Configuration</p>
     * 
     * @param request UpdateHttpsApplicationConfigurationRequest
     * @return UpdateHttpsApplicationConfigurationResponse
     */
    public UpdateHttpsApplicationConfigurationResponse updateHttpsApplicationConfiguration(UpdateHttpsApplicationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHttpsApplicationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify HTTPS Basic Configuration</p>
     * 
     * @param request UpdateHttpsBasicConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHttpsBasicConfigurationResponse
     */
    public UpdateHttpsBasicConfigurationResponse updateHttpsBasicConfigurationWithOptions(UpdateHttpsBasicConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ciphersuite)) {
            query.put("Ciphersuite", request.ciphersuite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ciphersuiteGroup)) {
            query.put("CiphersuiteGroup", request.ciphersuiteGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2)) {
            query.put("Http2", request.http2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http3)) {
            query.put("Http3", request.http3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.https)) {
            query.put("Https", request.https);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocspStapling)) {
            query.put("OcspStapling", request.ocspStapling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tls10)) {
            query.put("Tls10", request.tls10);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tls11)) {
            query.put("Tls11", request.tls11);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tls12)) {
            query.put("Tls12", request.tls12);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tls13)) {
            query.put("Tls13", request.tls13);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHttpsBasicConfiguration"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHttpsBasicConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify HTTPS Basic Configuration</p>
     * 
     * @param request UpdateHttpsBasicConfigurationRequest
     * @return UpdateHttpsBasicConfigurationResponse
     */
    public UpdateHttpsBasicConfigurationResponse updateHttpsBasicConfiguration(UpdateHttpsBasicConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHttpsBasicConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the IPv6 configuration of a website.</p>
     * 
     * @param request UpdateIPv6Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIPv6Response
     */
    public UpdateIPv6Response updateIPv6WithOptions(UpdateIPv6Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIPv6"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIPv6Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the IPv6 configuration of a website.</p>
     * 
     * @param request UpdateIPv6Request
     * @return UpdateIPv6Response
     */
    public UpdateIPv6Response updateIPv6(UpdateIPv6Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIPv6WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Site Image Transformation Configuration</p>
     * 
     * @param request UpdateImageTransformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageTransformResponse
     */
    public UpdateImageTransformResponse updateImageTransformWithOptions(UpdateImageTransformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImageTransform"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageTransformResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Site Image Transformation Configuration</p>
     * 
     * @param request UpdateImageTransformRequest
     * @return UpdateImageTransformResponse
     */
    public UpdateImageTransformResponse updateImageTransform(UpdateImageTransformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageTransformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom list.</p>
     * 
     * @param tmpReq UpdateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateListResponse
     */
    public UpdateListResponse updateListWithOptions(UpdateListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateListShrinkRequest request = new UpdateListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.items)) {
            request.itemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.items, "Items", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemsShrink)) {
            body.put("Items", request.itemsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom list.</p>
     * 
     * @param request UpdateListRequest
     * @return UpdateListResponse
     */
    public UpdateListResponse updateList(UpdateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Through this interface, you can modify multiple configurations of the load balancer, including but not limited to the name of the load balancer, whether to enable acceleration, session persistence strategy, and various advanced settings related to traffic routing.&gt;Notice: Changes to certain parameters may affect the stability of existing services, please operate with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify Load Balancer</p>
     * 
     * @param tmpReq UpdateLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLoadBalancerResponse
     */
    public UpdateLoadBalancerResponse updateLoadBalancerWithOptions(UpdateLoadBalancerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLoadBalancerShrinkRequest request = new UpdateLoadBalancerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adaptiveRouting)) {
            request.adaptiveRoutingShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adaptiveRouting, "AdaptiveRouting", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.defaultPools)) {
            request.defaultPoolsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.defaultPools, "DefaultPools", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.monitor)) {
            request.monitorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.monitor, "Monitor", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.randomSteering)) {
            request.randomSteeringShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.randomSteering, "RandomSteering", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adaptiveRoutingShrink)) {
            query.put("AdaptiveRouting", request.adaptiveRoutingShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultPoolsShrink)) {
            query.put("DefaultPools", request.defaultPoolsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallbackPool)) {
            query.put("FallbackPool", request.fallbackPool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorShrink)) {
            query.put("Monitor", request.monitorShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomSteeringShrink)) {
            query.put("RandomSteering", request.randomSteeringShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionPools)) {
            query.put("RegionPools", request.regionPools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            query.put("Rules", request.rulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionAffinity)) {
            query.put("SessionAffinity", request.sessionAffinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.steeringPolicy)) {
            query.put("SteeringPolicy", request.steeringPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subRegionPools)) {
            query.put("SubRegionPools", request.subRegionPools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoadBalancer"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoadBalancerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Through this interface, you can modify multiple configurations of the load balancer, including but not limited to the name of the load balancer, whether to enable acceleration, session persistence strategy, and various advanced settings related to traffic routing.&gt;Notice: Changes to certain parameters may affect the stability of existing services, please operate with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify Load Balancer</p>
     * 
     * @param request UpdateLoadBalancerRequest
     * @return UpdateLoadBalancerResponse
     */
    public UpdateLoadBalancerResponse updateLoadBalancer(UpdateLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLoadBalancerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of managed transforms for your website.</p>
     * 
     * @param request UpdateManagedTransformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateManagedTransformResponse
     */
    public UpdateManagedTransformResponse updateManagedTransformWithOptions(UpdateManagedTransformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addClientGeolocationHeader)) {
            query.put("AddClientGeolocationHeader", request.addClientGeolocationHeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addRealClientIpHeader)) {
            query.put("AddRealClientIpHeader", request.addRealClientIpHeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realClientIpHeaderName)) {
            query.put("RealClientIpHeaderName", request.realClientIpHeaderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateManagedTransform"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateManagedTransformResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of managed transforms for your website.</p>
     * 
     * @param request UpdateManagedTransformRequest
     * @return UpdateManagedTransformResponse
     */
    public UpdateManagedTransformResponse updateManagedTransform(UpdateManagedTransformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateManagedTransformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify network optimization configuration</p>
     * 
     * @param request UpdateNetworkOptimizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNetworkOptimizationResponse
     */
    public UpdateNetworkOptimizationResponse updateNetworkOptimizationWithOptions(UpdateNetworkOptimizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grpc)) {
            query.put("Grpc", request.grpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2Origin)) {
            query.put("Http2Origin", request.http2Origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartRouting)) {
            query.put("SmartRouting", request.smartRouting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadMaxFilesize)) {
            query.put("UploadMaxFilesize", request.uploadMaxFilesize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.websocket)) {
            query.put("Websocket", request.websocket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNetworkOptimization"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNetworkOptimizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify network optimization configuration</p>
     * 
     * @param request UpdateNetworkOptimizationRequest
     * @return UpdateNetworkOptimizationResponse
     */
    public UpdateNetworkOptimizationResponse updateNetworkOptimization(UpdateNetworkOptimizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNetworkOptimizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the Monitor</p>
     * 
     * @param tmpReq UpdateOriginPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOriginPoolResponse
     */
    public UpdateOriginPoolResponse updateOriginPoolWithOptions(UpdateOriginPoolRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateOriginPoolShrinkRequest request = new UpdateOriginPoolShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.origins)) {
            request.originsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.origins, "Origins", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originsShrink)) {
            query.put("Origins", request.originsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOriginPool"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOriginPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the Monitor</p>
     * 
     * @param request UpdateOriginPoolRequest
     * @return UpdateOriginPoolResponse
     */
    public UpdateOriginPoolResponse updateOriginPool(UpdateOriginPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOriginPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables IP convergence.</p>
     * 
     * @param request UpdateOriginProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOriginProtectionResponse
     */
    public UpdateOriginProtectionResponse updateOriginProtectionWithOptions(UpdateOriginProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.originConverge)) {
            query.put("OriginConverge", request.originConverge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOriginProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOriginProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables IP convergence.</p>
     * 
     * @param request UpdateOriginProtectionRequest
     * @return UpdateOriginProtectionResponse
     */
    public UpdateOriginProtectionResponse updateOriginProtection(UpdateOriginProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOriginProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the IP whitelist for origin protection used by a website to the latest version.</p>
     * 
     * @param request UpdateOriginProtectionIpWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOriginProtectionIpWhiteListResponse
     */
    public UpdateOriginProtectionIpWhiteListResponse updateOriginProtectionIpWhiteListWithOptions(UpdateOriginProtectionIpWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOriginProtectionIpWhiteList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOriginProtectionIpWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the IP whitelist for origin protection used by a website to the latest version.</p>
     * 
     * @param request UpdateOriginProtectionIpWhiteListRequest
     * @return UpdateOriginProtectionIpWhiteListResponse
     */
    public UpdateOriginProtectionIpWhiteListResponse updateOriginProtectionIpWhiteList(UpdateOriginProtectionIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOriginProtectionIpWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Origin Rule Configuration for Site</p>
     * 
     * @param request UpdateOriginRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOriginRuleResponse
     */
    public UpdateOriginRuleResponse updateOriginRuleWithOptions(UpdateOriginRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsRecord)) {
            query.put("DnsRecord", request.dnsRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow302Enable)) {
            query.put("Follow302Enable", request.follow302Enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow302MaxTries)) {
            query.put("Follow302MaxTries", request.follow302MaxTries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow302RetainArgs)) {
            query.put("Follow302RetainArgs", request.follow302RetainArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow302RetainHeader)) {
            query.put("Follow302RetainHeader", request.follow302RetainHeader);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follow302TargetHost)) {
            query.put("Follow302TargetHost", request.follow302TargetHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originHost)) {
            query.put("OriginHost", request.originHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originHttpPort)) {
            query.put("OriginHttpPort", request.originHttpPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originHttpsPort)) {
            query.put("OriginHttpsPort", request.originHttpsPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originMtls)) {
            query.put("OriginMtls", request.originMtls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originReadTimeout)) {
            query.put("OriginReadTimeout", request.originReadTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originScheme)) {
            query.put("OriginScheme", request.originScheme);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originSni)) {
            query.put("OriginSni", request.originSni);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originVerify)) {
            query.put("OriginVerify", request.originVerify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.range)) {
            query.put("Range", request.range);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rangeChunkSize)) {
            query.put("RangeChunkSize", request.rangeChunkSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOriginRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOriginRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Origin Rule Configuration for Site</p>
     * 
     * @param request UpdateOriginRuleRequest
     * @return UpdateOriginRuleResponse
     */
    public UpdateOriginRuleResponse updateOriginRule(UpdateOriginRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOriginRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a custom error page, such as the name, description, content type, and content of the page.</p>
     * 
     * @param request UpdatePageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePageResponse
     */
    public UpdatePageResponse updatePageWithOptions(UpdatePageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a custom error page, such as the name, description, content type, and content of the page.</p>
     * 
     * @param request UpdatePageRequest
     * @return UpdatePageResponse
     */
    public UpdatePageResponse updatePage(UpdatePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>套餐变配</p>
     * 
     * @param request UpdateRatePlanSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRatePlanSpecResponse
     */
    public UpdateRatePlanSpecResponse updateRatePlanSpecWithOptions(UpdateRatePlanSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPlanCode)) {
            query.put("TargetPlanCode", request.targetPlanCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPlanName)) {
            query.put("TargetPlanName", request.targetPlanName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRatePlanSpec"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRatePlanSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>套餐变配</p>
     * 
     * @param request UpdateRatePlanSpecRequest
     * @return UpdateRatePlanSpecResponse
     */
    public UpdateRatePlanSpecResponse updateRatePlanSpec(UpdateRatePlanSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRatePlanSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to update multiple types of DNS records, including but not limited to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI. You can modify the record content by providing the necessary fields such as Value, Priority, and Flag. For origins added in CNAME records such as OSS and S3, the API enables you to configure authentication details to ensure secure access.</p>
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>The record value (Value) must match the record type. For example, the CNAME record should correspond to the target domain name.</li>
     * <li>You must specify a priority (Priority) for some record types, such as MX and SRV.</li>
     * <li>You must specify specific fields such as Flag and Tag for CAA records.</li>
     * <li>When you update security records such as CERT and SSHFP, you must accurately set fields such as Type and Algorithm.</li>
     * <li>If your origin type is OSS or S3, configure the authentication details in AuthConf based on the permissions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates multiple types of DNS records and origin authentication configurations.</p>
     * 
     * @param tmpReq UpdateRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecordResponse
     */
    public UpdateRecordResponse updateRecordWithOptions(UpdateRecordRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRecordShrinkRequest request = new UpdateRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authConf)) {
            request.authConfShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authConf, "AuthConf", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authConfShrink)) {
            query.put("AuthConf", request.authConfShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            query.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            query.put("Data", request.dataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostPolicy)) {
            query.put("HostPolicy", request.hostPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxied)) {
            query.put("Proxied", request.proxied);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to update multiple types of DNS records, including but not limited to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI. You can modify the record content by providing the necessary fields such as Value, Priority, and Flag. For origins added in CNAME records such as OSS and S3, the API enables you to configure authentication details to ensure secure access.</p>
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>The record value (Value) must match the record type. For example, the CNAME record should correspond to the target domain name.</li>
     * <li>You must specify a priority (Priority) for some record types, such as MX and SRV.</li>
     * <li>You must specify specific fields such as Flag and Tag for CAA records.</li>
     * <li>When you update security records such as CERT and SSHFP, you must accurately set fields such as Type and Algorithm.</li>
     * <li>If your origin type is OSS or S3, configure the authentication details in AuthConf based on the permissions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates multiple types of DNS records and origin authentication configurations.</p>
     * 
     * @param request UpdateRecordRequest
     * @return UpdateRecordResponse
     */
    public UpdateRecordResponse updateRecord(UpdateRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Redirect Rule</p>
     * 
     * @param request UpdateRedirectRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRedirectRuleResponse
     */
    public UpdateRedirectRuleResponse updateRedirectRuleWithOptions(UpdateRedirectRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserveQueryString)) {
            query.put("ReserveQueryString", request.reserveQueryString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusCode)) {
            query.put("StatusCode", request.statusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUrl)) {
            query.put("TargetUrl", request.targetUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRedirectRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRedirectRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Redirect Rule</p>
     * 
     * @param request UpdateRedirectRuleRequest
     * @return UpdateRedirectRuleResponse
     */
    public UpdateRedirectRuleResponse updateRedirectRule(UpdateRedirectRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRedirectRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Rewrite URL Rule</p>
     * 
     * @param request UpdateRewriteUrlRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRewriteUrlRuleResponse
     */
    public UpdateRewriteUrlRuleResponse updateRewriteUrlRuleWithOptions(UpdateRewriteUrlRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryString)) {
            query.put("QueryString", request.queryString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rewriteQueryStringType)) {
            query.put("RewriteQueryStringType", request.rewriteQueryStringType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rewriteUriType)) {
            query.put("RewriteUriType", request.rewriteUriType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            query.put("Uri", request.uri);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRewriteUrlRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRewriteUrlRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify Rewrite URL Rule</p>
     * 
     * @param request UpdateRewriteUrlRuleRequest
     * @return UpdateRewriteUrlRuleResponse
     */
    public UpdateRewriteUrlRuleResponse updateRewriteUrlRule(UpdateRewriteUrlRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRewriteUrlRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改边缘函数路由配置</p>
     * 
     * @param request UpdateRoutineRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRoutineRouteResponse
     */
    public UpdateRoutineRouteResponse updateRoutineRouteWithOptions(UpdateRoutineRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bypass)) {
            query.put("Bypass", request.bypass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeEnable)) {
            query.put("RouteEnable", request.routeEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routineName)) {
            query.put("RoutineName", request.routineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRoutineRoute"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoutineRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改边缘函数路由配置</p>
     * 
     * @param request UpdateRoutineRouteRequest
     * @return UpdateRoutineRouteResponse
     */
    public UpdateRoutineRouteResponse updateRoutineRoute(UpdateRoutineRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRoutineRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a scheduled prefetch plan based on the plan ID.</p>
     * 
     * @param request UpdateScheduledPreloadExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScheduledPreloadExecutionResponse
     */
    public UpdateScheduledPreloadExecutionResponse updateScheduledPreloadExecutionWithOptions(UpdateScheduledPreloadExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            body.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sliceLen)) {
            body.put("SliceLen", request.sliceLen);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScheduledPreloadExecution"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScheduledPreloadExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a scheduled prefetch plan based on the plan ID.</p>
     * 
     * @param request UpdateScheduledPreloadExecutionRequest
     * @return UpdateScheduledPreloadExecutionResponse
     */
    public UpdateScheduledPreloadExecutionResponse updateScheduledPreloadExecution(UpdateScheduledPreloadExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateScheduledPreloadExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点放行搜索引擎爬虫配置</p>
     * 
     * @param request UpdateSeoBypassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSeoBypassResponse
     */
    public UpdateSeoBypassResponse updateSeoBypassWithOptions(UpdateSeoBypassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSeoBypass"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSeoBypassResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点放行搜索引擎爬虫配置</p>
     * 
     * @param request UpdateSeoBypassRequest
     * @return UpdateSeoBypassResponse
     */
    public UpdateSeoBypassResponse updateSeoBypass(UpdateSeoBypassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSeoBypassWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you change the DNS setup of a website from NS to CNAME, note the following prerequisites:</p>
     * <ul>
     * <li>The website only has proxied A/AAAA and CNAME records.</li>
     * <li>The DNS passthrough mode and custom nameserver features are not enabled for the website.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Converts the DNS setup option of a website.</p>
     * 
     * @param request UpdateSiteAccessTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteAccessTypeResponse
     */
    public UpdateSiteAccessTypeResponse updateSiteAccessTypeWithOptions(UpdateSiteAccessTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            query.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteAccessType"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteAccessTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you change the DNS setup of a website from NS to CNAME, note the following prerequisites:</p>
     * <ul>
     * <li>The website only has proxied A/AAAA and CNAME records.</li>
     * <li>The DNS passthrough mode and custom nameserver features are not enabled for the website.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Converts the DNS setup option of a website.</p>
     * 
     * @param request UpdateSiteAccessTypeRequest
     * @return UpdateSiteAccessTypeResponse
     */
    public UpdateSiteAccessTypeResponse updateSiteAccessType(UpdateSiteAccessTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteAccessTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the service location for a single website. This updates the acceleration configuration of the website to adapt to changes in traffic distribution, and improve user experience in specific regions.</p>
     * 
     * @param request UpdateSiteCoverageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteCoverageResponse
     */
    public UpdateSiteCoverageResponse updateSiteCoverageWithOptions(UpdateSiteCoverageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverage)) {
            query.put("Coverage", request.coverage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteCoverage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteCoverageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the service location for a single website. This updates the acceleration configuration of the website to adapt to changes in traffic distribution, and improve user experience in specific regions.</p>
     * 
     * @param request UpdateSiteCoverageRequest
     * @return UpdateSiteCoverageResponse
     */
    public UpdateSiteCoverageResponse updateSiteCoverage(UpdateSiteCoverageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteCoverageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of custom request header, response header, and cookie fields that are used to capture logs of a website.</p>
     * 
     * @param tmpReq UpdateSiteCustomLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteCustomLogResponse
     */
    public UpdateSiteCustomLogResponse updateSiteCustomLogWithOptions(UpdateSiteCustomLogRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSiteCustomLogShrinkRequest request = new UpdateSiteCustomLogShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cookies)) {
            request.cookiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cookies, "Cookies", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.requestHeaders)) {
            request.requestHeadersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.requestHeaders, "RequestHeaders", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.responseHeaders)) {
            request.responseHeadersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.responseHeaders, "ResponseHeaders", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cookiesShrink)) {
            body.put("Cookies", request.cookiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestHeadersShrink)) {
            body.put("RequestHeaders", request.requestHeadersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseHeadersShrink)) {
            body.put("ResponseHeaders", request.responseHeadersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteCustomLog"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteCustomLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of custom request header, response header, and cookie fields that are used to capture logs of a website.</p>
     * 
     * @param request UpdateSiteCustomLogRequest
     * @return UpdateSiteCustomLogResponse
     */
    public UpdateSiteCustomLogResponse updateSiteCustomLog(UpdateSiteCustomLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteCustomLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a real-time log delivery task.</p>
     * 
     * @param request UpdateSiteDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteDeliveryTaskResponse
     */
    public UpdateSiteDeliveryTaskResponse updateSiteDeliveryTaskWithOptions(UpdateSiteDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discardRate)) {
            body.put("DiscardRate", request.discardRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            body.put("FieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a real-time log delivery task.</p>
     * 
     * @param request UpdateSiteDeliveryTaskRequest
     * @return UpdateSiteDeliveryTaskResponse
     */
    public UpdateSiteDeliveryTaskResponse updateSiteDeliveryTask(UpdateSiteDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the status of a real-time log delivery task.</p>
     * 
     * @param request UpdateSiteDeliveryTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteDeliveryTaskStatusResponse
     */
    public UpdateSiteDeliveryTaskStatusResponse updateSiteDeliveryTaskStatusWithOptions(UpdateSiteDeliveryTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteDeliveryTaskStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteDeliveryTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the status of a real-time log delivery task.</p>
     * 
     * @param request UpdateSiteDeliveryTaskStatusRequest
     * @return UpdateSiteDeliveryTaskStatusResponse
     */
    public UpdateSiteDeliveryTaskStatusResponse updateSiteDeliveryTaskStatus(UpdateSiteDeliveryTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteDeliveryTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the site hold configuration of a website. After you enable site hold, other accounts cannot add your website domain or its subdomains to ESA.</p>
     * 
     * @param request UpdateSiteNameExclusiveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteNameExclusiveResponse
     */
    public UpdateSiteNameExclusiveResponse updateSiteNameExclusiveWithOptions(UpdateSiteNameExclusiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteNameExclusive"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteNameExclusiveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the site hold configuration of a website. After you enable site hold, other accounts cannot add your website domain or its subdomains to ESA.</p>
     * 
     * @param request UpdateSiteNameExclusiveRequest
     * @return UpdateSiteNameExclusiveResponse
     */
    public UpdateSiteNameExclusiveResponse updateSiteNameExclusive(UpdateSiteNameExclusiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteNameExclusiveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the ESA proxy configuration of a website.</p>
     * 
     * @param request UpdateSitePauseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSitePauseResponse
     */
    public UpdateSitePauseResponse updateSitePauseWithOptions(UpdateSitePauseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paused)) {
            query.put("Paused", request.paused);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSitePause"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSitePauseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the ESA proxy configuration of a website.</p>
     * 
     * @param request UpdateSitePauseRequest
     * @return UpdateSitePauseResponse
     */
    public UpdateSitePauseResponse updateSitePause(UpdateSitePauseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSitePauseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the custom nameserver names for a single website.</p>
     * 
     * @param request UpdateSiteVanityNSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteVanityNSResponse
     */
    public UpdateSiteVanityNSResponse updateSiteVanityNSWithOptions(UpdateSiteVanityNSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vanityNSList)) {
            query.put("VanityNSList", request.vanityNSList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteVanityNS"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteVanityNSResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the custom nameserver names for a single website.</p>
     * 
     * @param request UpdateSiteVanityNSRequest
     * @return UpdateSiteVanityNSResponse
     */
    public UpdateSiteVanityNSResponse updateSiteVanityNS(UpdateSiteVanityNSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteVanityNSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the tiered cache configuration of your website.</p>
     * 
     * @param request UpdateTieredCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTieredCacheResponse
     */
    public UpdateTieredCacheResponse updateTieredCacheWithOptions(UpdateTieredCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cacheArchitectureMode)) {
            query.put("CacheArchitectureMode", request.cacheArchitectureMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTieredCache"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTieredCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the tiered cache configuration of your website.</p>
     * 
     * @param request UpdateTieredCacheRequest
     * @return UpdateTieredCacheResponse
     */
    public UpdateTieredCacheResponse updateTieredCache(UpdateTieredCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTieredCacheWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a delivery task, including the task name, log field, log category, and discard rate.</p>
     * 
     * @param request UpdateUserDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserDeliveryTaskResponse
     */
    public UpdateUserDeliveryTaskResponse updateUserDeliveryTaskWithOptions(UpdateUserDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.details)) {
            body.put("Details", request.details);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discardRate)) {
            body.put("DiscardRate", request.discardRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            body.put("FieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a delivery task, including the task name, log field, log category, and discard rate.</p>
     * 
     * @param request UpdateUserDeliveryTaskRequest
     * @return UpdateUserDeliveryTaskResponse
     */
    public UpdateUserDeliveryTaskResponse updateUserDeliveryTask(UpdateUserDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <p>You can call this operation to enable or disable a delivery task by using TaskName and Method. The response includes the most recent status and operation result details of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a delivery task in your Alibaba Cloud account.</p>
     * 
     * @param request UpdateUserDeliveryTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserDeliveryTaskStatusResponse
     */
    public UpdateUserDeliveryTaskStatusResponse updateUserDeliveryTaskStatusWithOptions(UpdateUserDeliveryTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserDeliveryTaskStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserDeliveryTaskStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <p>You can call this operation to enable or disable a delivery task by using TaskName and Method. The response includes the most recent status and operation result details of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a delivery task in your Alibaba Cloud account.</p>
     * 
     * @param request UpdateUserDeliveryTaskStatusRequest
     * @return UpdateUserDeliveryTaskStatusResponse
     */
    public UpdateUserDeliveryTaskStatusResponse updateUserDeliveryTaskStatus(UpdateUserDeliveryTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDeliveryTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点视频处理配置</p>
     * 
     * @param request UpdateVideoProcessingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVideoProcessingResponse
     */
    public UpdateVideoProcessingResponse updateVideoProcessingWithOptions(UpdateVideoProcessingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flvSeekEnd)) {
            query.put("FlvSeekEnd", request.flvSeekEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flvSeekStart)) {
            query.put("FlvSeekStart", request.flvSeekStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flvVideoSeekMode)) {
            query.put("FlvVideoSeekMode", request.flvVideoSeekMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mp4SeekEnd)) {
            query.put("Mp4SeekEnd", request.mp4SeekEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mp4SeekStart)) {
            query.put("Mp4SeekStart", request.mp4SeekStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoSeekEnable)) {
            query.put("VideoSeekEnable", request.videoSeekEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVideoProcessing"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVideoProcessingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点视频处理配置</p>
     * 
     * @param request UpdateVideoProcessingRequest
     * @return UpdateVideoProcessingResponse
     */
    public UpdateVideoProcessingResponse updateVideoProcessing(UpdateVideoProcessingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVideoProcessingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update WAF Rule Page</p>
     * 
     * @param tmpReq UpdateWafRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWafRuleResponse
     */
    public UpdateWafRuleResponse updateWafRuleWithOptions(UpdateWafRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWafRuleShrinkRequest request = new UpdateWafRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.config)) {
            request.configShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.config, "Config", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configShrink)) {
            body.put("Config", request.configShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            body.put("Position", request.position);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWafRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWafRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update WAF Rule Page</p>
     * 
     * @param request UpdateWafRuleRequest
     * @return UpdateWafRuleResponse
     */
    public UpdateWafRuleResponse updateWafRule(UpdateWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWafRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update WAF Ruleset</p>
     * 
     * @param request UpdateWafRulesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWafRulesetResponse
     */
    public UpdateWafRulesetResponse updateWafRulesetWithOptions(UpdateWafRulesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWafRuleset"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWafRulesetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update WAF Ruleset</p>
     * 
     * @param request UpdateWafRulesetRequest
     * @return UpdateWafRulesetResponse
     */
    public UpdateWafRulesetResponse updateWafRuleset(UpdateWafRulesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWafRulesetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a waiting room.</p>
     * 
     * @param tmpReq UpdateWaitingRoomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWaitingRoomResponse
     */
    public UpdateWaitingRoomResponse updateWaitingRoomWithOptions(UpdateWaitingRoomRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWaitingRoomShrinkRequest request = new UpdateWaitingRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hostNameAndPath)) {
            request.hostNameAndPathShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hostNameAndPath, "HostNameAndPath", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cookieName)) {
            query.put("CookieName", request.cookieName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPageHtml)) {
            query.put("CustomPageHtml", request.customPageHtml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSessionRenewalEnable)) {
            query.put("DisableSessionRenewalEnable", request.disableSessionRenewalEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostNameAndPathShrink)) {
            query.put("HostNameAndPath", request.hostNameAndPathShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonResponseEnable)) {
            query.put("JsonResponseEnable", request.jsonResponseEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newUsersPerMinute)) {
            query.put("NewUsersPerMinute", request.newUsersPerMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueAllEnable)) {
            query.put("QueueAllEnable", request.queueAllEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingMethod)) {
            query.put("QueuingMethod", request.queuingMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingStatusCode)) {
            query.put("QueuingStatusCode", request.queuingStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionDuration)) {
            query.put("SessionDuration", request.sessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalActiveUsers)) {
            query.put("TotalActiveUsers", request.totalActiveUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomId)) {
            query.put("WaitingRoomId", request.waitingRoomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomType)) {
            query.put("WaitingRoomType", request.waitingRoomType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWaitingRoom"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWaitingRoomResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a waiting room.</p>
     * 
     * @param request UpdateWaitingRoomRequest
     * @return UpdateWaitingRoomResponse
     */
    public UpdateWaitingRoomResponse updateWaitingRoom(UpdateWaitingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWaitingRoomWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a waiting room event.</p>
     * 
     * @param request UpdateWaitingRoomEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWaitingRoomEventResponse
     */
    public UpdateWaitingRoomEventResponse updateWaitingRoomEventWithOptions(UpdateWaitingRoomEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPageHtml)) {
            query.put("CustomPageHtml", request.customPageHtml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSessionRenewalEnable)) {
            query.put("DisableSessionRenewalEnable", request.disableSessionRenewalEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonResponseEnable)) {
            query.put("JsonResponseEnable", request.jsonResponseEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newUsersPerMinute)) {
            query.put("NewUsersPerMinute", request.newUsersPerMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preQueueEnable)) {
            query.put("PreQueueEnable", request.preQueueEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preQueueStartTime)) {
            query.put("PreQueueStartTime", request.preQueueStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingMethod)) {
            query.put("QueuingMethod", request.queuingMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingStatusCode)) {
            query.put("QueuingStatusCode", request.queuingStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomPreQueueEnable)) {
            query.put("RandomPreQueueEnable", request.randomPreQueueEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionDuration)) {
            query.put("SessionDuration", request.sessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalActiveUsers)) {
            query.put("TotalActiveUsers", request.totalActiveUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomEventId)) {
            query.put("WaitingRoomEventId", request.waitingRoomEventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomType)) {
            query.put("WaitingRoomType", request.waitingRoomType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWaitingRoomEvent"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWaitingRoomEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a waiting room event.</p>
     * 
     * @param request UpdateWaitingRoomEventRequest
     * @return UpdateWaitingRoomEventResponse
     */
    public UpdateWaitingRoomEventResponse updateWaitingRoomEvent(UpdateWaitingRoomEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWaitingRoomEventWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This interface allows you to modify the rule settings of a specific waiting room in a site, including the rule name, enable status, and rule content, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify Waiting Room Rule</p>
     * 
     * @param request UpdateWaitingRoomRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWaitingRoomRuleResponse
     */
    public UpdateWaitingRoomRuleResponse updateWaitingRoomRuleWithOptions(UpdateWaitingRoomRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomRuleId)) {
            query.put("WaitingRoomRuleId", request.waitingRoomRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWaitingRoomRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWaitingRoomRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This interface allows you to modify the rule settings of a specific waiting room in a site, including the rule name, enable status, and rule content, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify Waiting Room Rule</p>
     * 
     * @param request UpdateWaitingRoomRuleRequest
     * @return UpdateWaitingRoomRuleResponse
     */
    public UpdateWaitingRoomRuleResponse updateWaitingRoomRule(UpdateWaitingRoomRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWaitingRoomRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a client certificate authority (CA) certificate.</p>
     * 
     * @param request UploadClientCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadClientCaCertificateResponse
     */
    public UploadClientCaCertificateResponse uploadClientCaCertificateWithOptions(UploadClientCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificate)) {
            body.put("Certificate", request.certificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadClientCaCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadClientCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a client certificate authority (CA) certificate.</p>
     * 
     * @param request UploadClientCaCertificateRequest
     * @return UploadClientCaCertificateResponse
     */
    public UploadClientCaCertificateResponse uploadClientCaCertificate(UploadClientCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadClientCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The file can be up to 10 MB in size.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads the file that contains resources to be purged or prefetched.</p>
     * 
     * @param request UploadFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadFileResponse
     */
    public UploadFileResponse uploadFileWithOptions(UploadFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadTaskName)) {
            query.put("UploadTaskName", request.uploadTaskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadFile"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadFileResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The file can be up to 10 MB in size.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads the file that contains resources to be purged or prefetched.</p>
     * 
     * @param request UploadFileRequest
     * @return UploadFileResponse
     */
    public UploadFileResponse uploadFile(UploadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadFileWithOptions(request, runtime);
    }

    public UploadFileResponse uploadFileAdvance(UploadFileAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "ESA"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        UploadFileRequest uploadFileReq = new UploadFileRequest();
        com.aliyun.openapiutil.Client.convert(request, uploadFileReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            uploadFileReq.url = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        UploadFileResponse uploadFileResp = this.uploadFileWithOptions(uploadFileReq, runtime);
        return uploadFileResp;
    }

    /**
     * <b>summary</b> : 
     * <p>上传源服务器CA证书</p>
     * 
     * @param request UploadOriginCaCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadOriginCaCertificateResponse
     */
    public UploadOriginCaCertificateResponse uploadOriginCaCertificateWithOptions(UploadOriginCaCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificate)) {
            body.put("Certificate", request.certificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadOriginCaCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadOriginCaCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传源服务器CA证书</p>
     * 
     * @param request UploadOriginCaCertificateRequest
     * @return UploadOriginCaCertificateResponse
     */
    public UploadOriginCaCertificateResponse uploadOriginCaCertificate(UploadOriginCaCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadOriginCaCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传域名回源客户端证书</p>
     * 
     * @param request UploadOriginClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadOriginClientCertificateResponse
     */
    public UploadOriginClientCertificateResponse uploadOriginClientCertificateWithOptions(UploadOriginClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificate)) {
            body.put("Certificate", request.certificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            body.put("PrivateKey", request.privateKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadOriginClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadOriginClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传域名回源客户端证书</p>
     * 
     * @param request UploadOriginClientCertificateRequest
     * @return UploadOriginClientCertificateResponse
     */
    public UploadOriginClientCertificateResponse uploadOriginClientCertificate(UploadOriginClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadOriginClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upload site origin client certificate</p>
     * 
     * @param request UploadSiteOriginClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadSiteOriginClientCertificateResponse
     */
    public UploadSiteOriginClientCertificateResponse uploadSiteOriginClientCertificateWithOptions(UploadSiteOriginClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificate)) {
            body.put("Certificate", request.certificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            body.put("PrivateKey", request.privateKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadSiteOriginClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadSiteOriginClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upload site origin client certificate</p>
     * 
     * @param request UploadSiteOriginClientCertificateRequest
     * @return UploadSiteOriginClientCertificateResponse
     */
    public UploadSiteOriginClientCertificateResponse uploadSiteOriginClientCertificate(UploadSiteOriginClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadSiteOriginClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>For a website connected by using NS setup, this operation verifies whether the nameservers of the website are the nameservers assigned by Alibaba Cloud.</li>
     * <li>For a website connected by using CNAME setup, this operation verifies whether the website has a TXT record whose hostname is  _esaauth.[websiteDomainName] and record value is the value of VerifyCode to the DNS records of your domain. You can see the VerifyCode field in the site information.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Verifies the ownership of a website domain. Websites that pass the verification are automatically activated.</p>
     * 
     * @param request VerifySiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifySiteResponse
     */
    public VerifySiteResponse verifySiteWithOptions(VerifySiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifySite"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifySiteResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>For a website connected by using NS setup, this operation verifies whether the nameservers of the website are the nameservers assigned by Alibaba Cloud.</li>
     * <li>For a website connected by using CNAME setup, this operation verifies whether the website has a TXT record whose hostname is  _esaauth.[websiteDomainName] and record value is the value of VerifyCode to the DNS records of your domain. You can see the VerifyCode field in the site information.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Verifies the ownership of a website domain. Websites that pass the verification are automatically activated.</p>
     * 
     * @param request VerifySiteRequest
     * @return VerifySiteResponse
     */
    public VerifySiteResponse verifySite(VerifySiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifySiteWithOptions(request, runtime);
    }
}
