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
     * <p>Activates a client certificate.</p>
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
     * <p>Activates a client certificate.</p>
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
     * <p>申请免费证书</p>
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
     * <p>申请免费证书</p>
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
     * <p>Batch queries the objects that match specific expressions.</p>
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
     * <p>Batch queries the objects that match specific expressions.</p>
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
     * <p>创建客户端证书</p>
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
     * <p>创建客户端证书</p>
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
     * <b>summary</b> : 
     * <p>新增源地址池</p>
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
     * <b>summary</b> : 
     * <p>新增源地址池</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.specName)) {
            body.put("SpecName", request.specName);
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
     * <p>Adds a route to map a URL to a routine so that the routine can be triggered to respond to requests destined for the URL.</p>
     * 
     * @param request CreateRoutineRelatedRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoutineRelatedRouteResponse
     */
    public CreateRoutineRelatedRouteResponse createRoutineRelatedRouteWithOptions(CreateRoutineRelatedRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.byPass)) {
            body.put("ByPass", request.byPass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.route)) {
            body.put("Route", request.route);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoutineRelatedRoute"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoutineRelatedRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a route to map a URL to a routine so that the routine can be triggered to respond to requests destined for the URL.</p>
     * 
     * @param request CreateRoutineRelatedRouteRequest
     * @return CreateRoutineRelatedRouteResponse
     */
    public CreateRoutineRelatedRouteResponse createRoutineRelatedRoute(CreateRoutineRelatedRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoutineRelatedRouteWithOptions(request, runtime);
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
     * <p>Creates a waiting room bypass rule.</p>
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
     * <p>Creates a waiting room bypass rule.</p>
     * 
     * @param request CreateWaitingRoomRuleRequest
     * @return CreateWaitingRoomRuleResponse
     */
    public CreateWaitingRoomRuleResponse createWaitingRoomRule(CreateWaitingRoomRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWaitingRoomRuleWithOptions(request, runtime);
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
     * <p>删除客户端证书</p>
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
     * <p>删除客户端证书</p>
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
     * <b>summary</b> : 
     * <p>删除源地址池</p>
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
     * <p>删除源地址池</p>
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
     * <p>Deletes a route that is associated with a routine.</p>
     * 
     * @param request DeleteRoutineRelatedRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoutineRelatedRouteResponse
     */
    public DeleteRoutineRelatedRouteResponse deleteRoutineRelatedRouteWithOptions(DeleteRoutineRelatedRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.route)) {
            body.put("Route", request.route);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            body.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutineRelatedRoute"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineRelatedRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a route that is associated with a routine.</p>
     * 
     * @param request DeleteRoutineRelatedRouteRequest
     * @return DeleteRoutineRelatedRouteResponse
     */
    public DeleteRoutineRelatedRouteResponse deleteRoutineRelatedRoute(DeleteRoutineRelatedRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineRelatedRouteWithOptions(request, runtime);
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
     * <p>查询DCDN DDoS用户bps、pps数据</p>
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
     * <p>查询DCDN DDoS用户bps、pps数据</p>
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
     * <p>ddos分析七层qps走势图接口</p>
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
     * <p>ddos分析七层qps走势图接口</p>
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
     * <p>Modifies the Web Application Firewall (WAF) configuration of a website, such as the client IP address that is identified by WAF.</p>
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
     * <p>Modifies the Web Application Firewall (WAF) configuration of a website, such as the client IP address that is identified by WAF.</p>
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
     * <p>Queries certificate information about a website.</p>
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
     * <p>Queries certificate information about a website.</p>
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
     * <p>查询证书quota及用量</p>
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
     * <p>查询证书quota及用量</p>
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
     * <p>获取客户端CA证书信息</p>
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
     * <p>获取客户端CA证书信息</p>
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
     * <b>summary</b> : 
     * <p>查询特定源地址池</p>
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
     * <p>查询特定源地址池</p>
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
     * <p>Queries the Web Application Firewall (WAF) configurations of a website.</p>
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
     * <p>Queries the Web Application Firewall (WAF) configurations of a website.</p>
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
     * <p>Queries the application key (AppKey) that is used for authentication and data exchange in bot behavior detection in Web Application Firewall (WAF).</p>
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
     * <p>Queries the application key (AppKey) that is used for authentication and data exchange in bot behavior detection in Web Application Firewall (WAF).</p>
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
     * <p>Queries the quotas of Web Application Firewall (WAF) resources, such as managed rule groups, custom lists, custom error pages, and scenario-specific policies.</p>
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
     * <p>Queries the quotas of Web Application Firewall (WAF) resources, such as managed rule groups, custom lists, custom error pages, and scenario-specific policies.</p>
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
     * <p>Queries the cache reserve instances in your Alibaba Cloud account.</p>
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
     * <p>Queries the cache reserve instances in your Alibaba Cloud account.</p>
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
     * <p>查询站点下证书列表</p>
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
     * <p>查询站点下证书列表</p>
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
     * <p>查询TLS密码套件列表</p>
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
     * <p>查询TLS密码套件列表</p>
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
     * <p>When you call an operation to create a traffic steering policy based on the originating country or region for a load balancer, you can use the code of a region or subregion to specify traffic that is sent from the region or subregion.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information that can be used to configure a traffic steering policy based on the originating country or region for a load balancer, such as the code and code descriptions of the regions and subregions of the load balancer.</p>
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
     * <p>When you call an operation to create a traffic steering policy based on the originating country or region for a load balancer, you can use the code of a region or subregion to specify traffic that is sent from the region or subregion.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information that can be used to configure a traffic steering policy based on the originating country or region for a load balancer, such as the code and code descriptions of the regions and subregions of the load balancer.</p>
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
     * <p>Queries all WAF managed rule groups in your Alibaba Cloud account.</p>
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
     * <p>Queries all WAF managed rule groups in your Alibaba Cloud account.</p>
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
     * <p>查询源地址池列表</p>
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
     * <p>查询源地址池列表</p>
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
     * <p>Lists all custom error pages that you created. You can define the page number and the number of entries per page to display the response.</p>
     * 
     * @param request ListPagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPagesResponse
     */
    public ListPagesResponse listPagesWithOptions(ListPagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <b>description</b> :
     * <p>You can call this operation to query the specifications that you can select for a routine.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the specifications that you can select for a routine based on the plan type. The response contains all specifications that you can select for a routine. The IsAvailable parameter indicates whether a specification is available.</p>
     * 
     * @param request ListRoutineOptionalSpecsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoutineOptionalSpecsResponse
     */
    public ListRoutineOptionalSpecsResponse listRoutineOptionalSpecsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoutineOptionalSpecs"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoutineOptionalSpecsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the specifications that you can select for a routine.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the specifications that you can select for a routine based on the plan type. The response contains all specifications that you can select for a routine. The IsAvailable parameter indicates whether a specification is available.</p>
     * @return ListRoutineOptionalSpecsResponse
     */
    public ListRoutineOptionalSpecsResponse listRoutineOptionalSpecs() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRoutineOptionalSpecsWithOptions(runtime);
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
     * <p>Lists all Web Application Firewall (WAF) managed rules or some of them based on specific conditions. You can call this operation to query the details of WAF rules by page.</p>
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
     * <p>Lists all Web Application Firewall (WAF) managed rules or some of them based on specific conditions. You can call this operation to query the details of WAF rules by page.</p>
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
     * <p>Queries the WAF rule categories that are applied to a website and related rulesets.</p>
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
     * <p>Queries the WAF rule categories that are applied to a website and related rulesets.</p>
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
     * <p>Queries template rules in Web Application Firewall (WAF). In most cases, these rules are pre-defined rulesets that are used to quickly enable protection against common types of attacks.</p>
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
     * <p>Queries template rules in Web Application Firewall (WAF). In most cases, these rules are pre-defined rulesets that are used to quickly enable protection against common types of attacks.</p>
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
     * <p>Queries the usage details of WAF rules.</p>
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
     * <p>Queries the usage details of WAF rules.</p>
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
     * <p>You can call this operation to query the waiting room bypass rules that are associated with a website.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the waiting room bypass rules configured for a waiting room.</p>
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
     * <p>You can call this operation to query the waiting room bypass rules that are associated with a website.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the waiting room bypass rules configured for a waiting room.</p>
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
     * @param tmpReq PublishRoutineCodeVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishRoutineCodeVersionResponse
     */
    public PublishRoutineCodeVersionResponse publishRoutineCodeVersionWithOptions(PublishRoutineCodeVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PublishRoutineCodeVersionShrinkRequest request = new PublishRoutineCodeVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.canaryAreaList)) {
            request.canaryAreaListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.canaryAreaList, "CanaryAreaList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.canaryAreaListShrink)) {
            body.put("CanaryAreaList", request.canaryAreaListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.canaryCodeVersion)) {
            body.put("CanaryCodeVersion", request.canaryCodeVersion);
        }

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
     * <p>Purges resources cached on points of presence (POPs). You can purge the cache by file URL, directory, cache tag, hostname, or URL with specified parameters ignored, or purge all the cache.</p>
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
     * <p>Purges resources cached on points of presence (POPs). You can purge the cache by file URL, directory, cache tag, hostname, or URL with specified parameters ignored, or purge all the cache.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.update)) {
            body.put("Update", request.update);
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
     * <p>Updates the name of a namespace in Edge KV.</p>
     * 
     * @param request UpdateKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKvNamespaceResponse
     */
    public UpdateKvNamespaceResponse updateKvNamespaceWithOptions(UpdateKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKvNamespace"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKvNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the name of a namespace in Edge KV.</p>
     * 
     * @param request UpdateKvNamespaceRequest
     * @return UpdateKvNamespaceResponse
     */
    public UpdateKvNamespaceResponse updateKvNamespace(UpdateKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改监视器</p>
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
     * <p>修改监视器</p>
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
     * <b>description</b> :
     * <p>When you change the DNS setup of a website from NS to CNAME, take note of the following items:</p>
     * <ul>
     * <li>Make sure that the website has only proxied A/AAAA and CNAME records.</li>
     * <li>Make sure that ESA proxy is not disabled for the website and custom nameservers are not configured.</li>
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
     * <p>When you change the DNS setup of a website from NS to CNAME, take note of the following items:</p>
     * <ul>
     * <li>Make sure that the website has only proxied A/AAAA and CNAME records.</li>
     * <li>Make sure that ESA proxy is not disabled for the website and custom nameservers are not configured.</li>
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
     * <p>You can call this API operation to modify the configurations of a waiting room bypass rule for your website, including the rule name, status, and rule content.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of a waiting room bypass rule for a website.</p>
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
     * <p>You can call this API operation to modify the configurations of a waiting room bypass rule for your website, including the rule name, status, and rule content.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of a waiting room bypass rule for a website.</p>
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
     * <p>上传客户端CA证书</p>
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
     * <p>上传客户端CA证书</p>
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
