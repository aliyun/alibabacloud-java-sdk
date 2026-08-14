// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.dts20200101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dts.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dts.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dts.aliyuncs.com"),
            new TeaPair("eu-west-1", "dts.aliyuncs.com"),
            new TeaPair("us-west-1", "dts.aliyuncs.com"),
            new TeaPair("us-east-1", "dts.aliyuncs.com"),
            new TeaPair("eu-central-1", "dts.aliyuncs.com"),
            new TeaPair("me-east-1", "dts.aliyuncs.com"),
            new TeaPair("ap-south-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dts.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dts.aliyuncs.com"),
            new TeaPair("cn-fujian", "dts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "dts.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dts.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "dts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dts.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "dts.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "dts.ap-northeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "dts.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "dts.ap-southeast-7.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "dts.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-heyuan", "dts.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-wuhan-lr", "dts.cn-wuhan-lr.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "dts.cn-zhengzhou-jva.aliyuncs.com"),
            new TeaPair("me-central-1", "dts.me-central-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dts", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }

    public java.util.Map<String, ?> _postOSSObject(String bucketName, java.util.Map<String, ?> data, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("key", com.aliyun.teautil.Common.defaultString(runtime.key, _key)),
            new TeaPair("cert", com.aliyun.teautil.Common.defaultString(runtime.cert, _cert)),
            new TeaPair("ca", com.aliyun.teautil.Common.defaultString(runtime.ca, _ca)),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("socks5Proxy", com.aliyun.teautil.Common.defaultString(runtime.socks5Proxy, _socks5Proxy)),
            new TeaPair("socks5NetWork", com.aliyun.teautil.Common.defaultString(runtime.socks5NetWork, _socks5NetWork)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", com.aliyun.teaopenapi.Client.defaultAny(runtime.ignoreSSL, false)),
            new TeaPair("tlsMinVersion", _tlsMinVersion)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                java.util.Map<String, Object> form = com.aliyun.teautil.Common.assertAsMap(data);
                String boundary = com.aliyun.fileform.Client.getBoundary();
                String tmp = com.aliyun.teautil.Common.assertAsString(form.get("host"));
                String host = "" + bucketName + "." + tmp + "";
                request_.protocol = "HTTPS";
                request_.method = "POST";
                request_.pathname = "/";
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", host),
                    new TeaPair("date", com.aliyun.teautil.Common.getDateUTCString()),
                    new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(""))
                );
                request_.headers.put("content-type", "multipart/form-data; boundary=" + boundary + "");
                request_.body = com.aliyun.fileform.Client.toFileForm(form, boundary);
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                java.util.Map<String, Object> respMap = null;
                String bodyStr = com.aliyun.teautil.Common.readAsString(response_.body);
                if (com.aliyun.teautil.Common.is4xx(response_.statusCode) || com.aliyun.teautil.Common.is5xx(response_.statusCode)) {
                    respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                    java.util.Map<String, Object> err = com.aliyun.teautil.Common.assertAsMap(respMap.get("Error"));
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("code", err.get("Code")),
                        new TeaPair("message", err.get("Message")),
                        new TeaPair("data", TeaConverter.buildMap(
                            new TeaPair("httpCode", response_.statusCode),
                            new TeaPair("requestId", err.get("RequestId")),
                            new TeaPair("hostId", err.get("HostId"))
                        ))
                    ));
                }

                respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                return TeaConverter.merge(Object.class,
                    respMap
                );
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
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
     * <ul>
     * <li>You can perform the required pre-configurations in the console and then preview the corresponding OpenAPI parameter information to help you specify request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</li>
     * <li>Tasks on dedicated clusters support only the configure-before-purchase mode and do not support cross-region tasks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a data migration or synchronization task.</p>
     * 
     * @param request ConfigureDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureDtsJobResponse
     */
    public ConfigureDtsJobResponse configureDtsJobWithOptions(ConfigureDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            query.put("Checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCheckConfigure)) {
            query.put("DataCheckConfigure", request.dataCheckConfigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataInitialization)) {
            query.put("DataInitialization", request.dataInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSynchronization)) {
            query.put("DataSynchronization", request.dataSynchronization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayNotice)) {
            query.put("DelayNotice", request.delayNotice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayPhone)) {
            query.put("DelayPhone", request.delayPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayRuleTime)) {
            query.put("DelayRuleTime", request.delayRuleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destCaCertificateOssUrl)) {
            query.put("DestCaCertificateOssUrl", request.destCaCertificateOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destCaCertificatePassword)) {
            query.put("DestCaCertificatePassword", request.destCaCertificatePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destClientCertOssUrl)) {
            query.put("DestClientCertOssUrl", request.destClientCertOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destClientKeyOssUrl)) {
            query.put("DestClientKeyOssUrl", request.destClientKeyOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destClientPassword)) {
            query.put("DestClientPassword", request.destClientPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPrimaryVswId)) {
            query.put("DestPrimaryVswId", request.destPrimaryVswId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destSecondaryVswId)) {
            query.put("DestSecondaryVswId", request.destSecondaryVswId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointDataBaseName)) {
            query.put("DestinationEndpointDataBaseName", request.destinationEndpointDataBaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointEngineName)) {
            query.put("DestinationEndpointEngineName", request.destinationEndpointEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointIP)) {
            query.put("DestinationEndpointIP", request.destinationEndpointIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointInstanceID)) {
            query.put("DestinationEndpointInstanceID", request.destinationEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointInstanceType)) {
            query.put("DestinationEndpointInstanceType", request.destinationEndpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointOracleSID)) {
            query.put("DestinationEndpointOracleSID", request.destinationEndpointOracleSID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointOwnerID)) {
            query.put("DestinationEndpointOwnerID", request.destinationEndpointOwnerID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointPassword)) {
            query.put("DestinationEndpointPassword", request.destinationEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointPort)) {
            query.put("DestinationEndpointPort", request.destinationEndpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointRegion)) {
            query.put("DestinationEndpointRegion", request.destinationEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointRole)) {
            query.put("DestinationEndpointRole", request.destinationEndpointRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointUserName)) {
            query.put("DestinationEndpointUserName", request.destinationEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disasterRecoveryJob)) {
            query.put("DisasterRecoveryJob", request.disasterRecoveryJob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsBisLabel)) {
            query.put("DtsBisLabel", request.dtsBisLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobName)) {
            query.put("DtsJobName", request.dtsJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorNotice)) {
            query.put("ErrorNotice", request.errorNotice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorPhone)) {
            query.put("ErrorPhone", request.errorPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileOssUrl)) {
            query.put("FileOssUrl", request.fileOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDu)) {
            query.put("MaxDu", request.maxDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDu)) {
            query.put("MinDu", request.minDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointDatabaseName)) {
            query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointEngineName)) {
            query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointIP)) {
            query.put("SourceEndpointIP", request.sourceEndpointIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceID)) {
            query.put("SourceEndpointInstanceID", request.sourceEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceType)) {
            query.put("SourceEndpointInstanceType", request.sourceEndpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointOracleSID)) {
            query.put("SourceEndpointOracleSID", request.sourceEndpointOracleSID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointOwnerID)) {
            query.put("SourceEndpointOwnerID", request.sourceEndpointOwnerID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPassword)) {
            query.put("SourceEndpointPassword", request.sourceEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPort)) {
            query.put("SourceEndpointPort", request.sourceEndpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRole)) {
            query.put("SourceEndpointRole", request.sourceEndpointRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointUserName)) {
            query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointVSwitchID)) {
            query.put("SourceEndpointVSwitchID", request.sourceEndpointVSwitchID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcCaCertificateOssUrl)) {
            query.put("SrcCaCertificateOssUrl", request.srcCaCertificateOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcCaCertificatePassword)) {
            query.put("SrcCaCertificatePassword", request.srcCaCertificatePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcClientCertOssUrl)) {
            query.put("SrcClientCertOssUrl", request.srcClientCertOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcClientKeyOssUrl)) {
            query.put("SrcClientKeyOssUrl", request.srcClientKeyOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcClientPassword)) {
            query.put("SrcClientPassword", request.srcClientPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPrimaryVswId)) {
            query.put("SrcPrimaryVswId", request.srcPrimaryVswId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcSecondaryVswId)) {
            query.put("SrcSecondaryVswId", request.srcSecondaryVswId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureInitialization)) {
            query.put("StructureInitialization", request.structureInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbList)) {
            body.put("DbList", request.dbList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserve)) {
            body.put("Reserve", request.reserve);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureDtsJobResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can perform the required pre-configurations in the console and then preview the corresponding OpenAPI parameter information to help you specify request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</li>
     * <li>Tasks on dedicated clusters support only the configure-before-purchase mode and do not support cross-region tasks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a data migration or synchronization task.</p>
     * 
     * @param request ConfigureDtsJobRequest
     * @return ConfigureDtsJobResponse
     */
    public ConfigureDtsJobResponse configureDtsJob(ConfigureDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureDtsJobWithOptions(request, runtime);
    }

    public ConfigureDtsJobResponse configureDtsJobAdvance(ConfigureDtsJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
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
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "Dts"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        ConfigureDtsJobRequest configureDtsJobReq = new ConfigureDtsJobRequest();
        com.aliyun.openapiutil.Client.convert(request, configureDtsJobReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileOssUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileOssUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            configureDtsJobReq.fileOssUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        ConfigureDtsJobResponse configureDtsJobResp = this.configureDtsJobWithOptions(configureDtsJobReq, runtime);
        return configureDtsJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a legacy data migration task.</p>
     * 
     * @param request ConfigureMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureMigrationJobResponse
     */
    public ConfigureMigrationJobResponse configureMigrationJobWithOptions(ConfigureMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            query.put("Checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobName)) {
            query.put("MigrationJobName", request.migrationJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationReserved)) {
            query.put("MigrationReserved", request.migrationReserved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpoint)) {
            query.put("DestinationEndpoint", request.destinationEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationMode)) {
            query.put("MigrationMode", request.migrationMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationObject)) {
            body.put("MigrationObject", request.migrationObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureMigrationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a legacy data migration task.</p>
     * 
     * @param request ConfigureMigrationJobRequest
     * @return ConfigureMigrationJobResponse
     */
    public ConfigureMigrationJobResponse configureMigrationJob(ConfigureMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureMigrationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures monitoring alerts to monitor the latency and exception status of a data migration task.</p>
     * 
     * @param request ConfigureMigrationJobAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureMigrationJobAlertResponse
     */
    public ConfigureMigrationJobAlertResponse configureMigrationJobAlertWithOptions(ConfigureMigrationJobAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertPhone)) {
            query.put("DelayAlertPhone", request.delayAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertStatus)) {
            query.put("DelayAlertStatus", request.delayAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayOverSeconds)) {
            query.put("DelayOverSeconds", request.delayOverSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertPhone)) {
            query.put("ErrorAlertPhone", request.errorAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertStatus)) {
            query.put("ErrorAlertStatus", request.errorAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureMigrationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureMigrationJobAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures monitoring alerts to monitor the latency and exception status of a data migration task.</p>
     * 
     * @param request ConfigureMigrationJobAlertRequest
     * @return ConfigureMigrationJobAlertResponse
     */
    public ConfigureMigrationJobAlertResponse configureMigrationJobAlert(ConfigureMigrationJobAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureMigrationJobAlertWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can perform the required pre-configurations in the console and then preview the corresponding OpenAPI parameter information to help you specify request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures a DTS change tracking task.</p>
     * 
     * @param request ConfigureSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSubscriptionResponse
     */
    public ConfigureSubscriptionResponse configureSubscriptionWithOptions(ConfigureSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            query.put("Checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbList)) {
            query.put("DbList", request.dbList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayNotice)) {
            query.put("DelayNotice", request.delayNotice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayPhone)) {
            query.put("DelayPhone", request.delayPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayRuleTime)) {
            query.put("DelayRuleTime", request.delayRuleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsBisLabel)) {
            query.put("DtsBisLabel", request.dtsBisLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobName)) {
            query.put("DtsJobName", request.dtsJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorNotice)) {
            query.put("ErrorNotice", request.errorNotice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorPhone)) {
            query.put("ErrorPhone", request.errorPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDu)) {
            query.put("MaxDu", request.maxDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDu)) {
            query.put("MinDu", request.minDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserve)) {
            query.put("Reserve", request.reserve);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointDatabaseName)) {
            query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointEngineName)) {
            query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointIP)) {
            query.put("SourceEndpointIP", request.sourceEndpointIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceID)) {
            query.put("SourceEndpointInstanceID", request.sourceEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceType)) {
            query.put("SourceEndpointInstanceType", request.sourceEndpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointOracleSID)) {
            query.put("SourceEndpointOracleSID", request.sourceEndpointOracleSID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointOwnerID)) {
            query.put("SourceEndpointOwnerID", request.sourceEndpointOwnerID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPassword)) {
            query.put("SourceEndpointPassword", request.sourceEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPort)) {
            query.put("SourceEndpointPort", request.sourceEndpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRole)) {
            query.put("SourceEndpointRole", request.sourceEndpointRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointUserName)) {
            query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcCaCertificateOssUrl)) {
            query.put("SrcCaCertificateOssUrl", request.srcCaCertificateOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcCaCertificatePassword)) {
            query.put("SrcCaCertificatePassword", request.srcCaCertificatePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcClientCertOssUrl)) {
            query.put("SrcClientCertOssUrl", request.srcClientCertOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcClientKeyOssUrl)) {
            query.put("SrcClientKeyOssUrl", request.srcClientKeyOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcClientPassword)) {
            query.put("SrcClientPassword", request.srcClientPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDataTypeDDL)) {
            query.put("SubscriptionDataTypeDDL", request.subscriptionDataTypeDDL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDataTypeDML)) {
            query.put("SubscriptionDataTypeDML", request.subscriptionDataTypeDML);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceNetworkType)) {
            query.put("SubscriptionInstanceNetworkType", request.subscriptionInstanceNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceVPCId)) {
            query.put("SubscriptionInstanceVPCId", request.subscriptionInstanceVPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceVSwitchId)) {
            query.put("SubscriptionInstanceVSwitchId", request.subscriptionInstanceVSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSubscription"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSubscriptionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can perform the required pre-configurations in the console and then preview the corresponding OpenAPI parameter information to help you specify request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures a DTS change tracking task.</p>
     * 
     * @param request ConfigureSubscriptionRequest
     * @return ConfigureSubscriptionResponse
     */
    public ConfigureSubscriptionResponse configureSubscription(ConfigureSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSubscriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/49436.html">CreateSubscriptionInstance</a> operation to create a change tracking instance.</p>
     * <blockquote>
     * <p>In the <strong>Advanced Settings</strong> step of the console, move the pointer over the <strong>Next: Save the task and perform a precheck</strong> button, and then click <strong>Preview OpenAPI parameters</strong> in the tooltip to view the parameter information for configuring this instance by using API operations.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures a change tracking channel. This is a legacy operation.</p>
     * 
     * @param request ConfigureSubscriptionInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSubscriptionInstanceResponse
     */
    public ConfigureSubscriptionInstanceResponse configureSubscriptionInstanceWithOptions(ConfigureSubscriptionInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceName)) {
            query.put("SubscriptionInstanceName", request.subscriptionInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceNetworkType)) {
            query.put("SubscriptionInstanceNetworkType", request.subscriptionInstanceNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDataType)) {
            query.put("SubscriptionDataType", request.subscriptionDataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstance)) {
            query.put("SubscriptionInstance", request.subscriptionInstance);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionObject)) {
            body.put("SubscriptionObject", request.subscriptionObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSubscriptionInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/49436.html">CreateSubscriptionInstance</a> operation to create a change tracking instance.</p>
     * <blockquote>
     * <p>In the <strong>Advanced Settings</strong> step of the console, move the pointer over the <strong>Next: Save the task and perform a precheck</strong> button, and then click <strong>Preview OpenAPI parameters</strong> in the tooltip to view the parameter information for configuring this instance by using API operations.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures a change tracking channel. This is a legacy operation.</p>
     * 
     * @param request ConfigureSubscriptionInstanceRequest
     * @return ConfigureSubscriptionInstanceResponse
     */
    public ConfigureSubscriptionInstanceResponse configureSubscriptionInstance(ConfigureSubscriptionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSubscriptionInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures monitoring and alerting to monitor the latency and exception status of a change tracking channel.</p>
     * 
     * @param request ConfigureSubscriptionInstanceAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSubscriptionInstanceAlertResponse
     */
    public ConfigureSubscriptionInstanceAlertResponse configureSubscriptionInstanceAlertWithOptions(ConfigureSubscriptionInstanceAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertPhone)) {
            query.put("DelayAlertPhone", request.delayAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertStatus)) {
            query.put("DelayAlertStatus", request.delayAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayOverSeconds)) {
            query.put("DelayOverSeconds", request.delayOverSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertPhone)) {
            query.put("ErrorAlertPhone", request.errorAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertStatus)) {
            query.put("ErrorAlertStatus", request.errorAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSubscriptionInstanceAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSubscriptionInstanceAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures monitoring and alerting to monitor the latency and exception status of a change tracking channel.</p>
     * 
     * @param request ConfigureSubscriptionInstanceAlertRequest
     * @return ConfigureSubscriptionInstanceAlertResponse
     */
    public ConfigureSubscriptionInstanceAlertResponse configureSubscriptionInstanceAlert(ConfigureSubscriptionInstanceAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSubscriptionInstanceAlertWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/49446.html">CreateSynchronizationJob</a> operation to create a data synchronization instance.</p>
     * <blockquote>
     * <ul>
     * <li>After this operation is called, the data synchronization instance automatically starts and performs a precheck. You do not need to call the <a href="https://help.aliyun.com/document_detail/49448.html">StartSynchronizationJob</a> operation to start the instance.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the data synchronization instance fails to start, the precheck may have failed. You can call the <a href="https://help.aliyun.com/document_detail/49453.html">DescribeSynchronizationJobStatus</a> operation to query the status of the data synchronization instance, obtain the error message of the precheck failure, and adjust the parameters. After the adjustment, you can call the <a href="https://help.aliyun.com/document_detail/49448.html">StartSynchronizationJob</a> operation to restart the data synchronization instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a data synchronization task by using the previous version.</p>
     * 
     * @param request ConfigureSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSynchronizationJobResponse
     */
    public ConfigureSynchronizationJobResponse configureSynchronizationJobWithOptions(ConfigureSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            query.put("Checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataInitialization)) {
            query.put("DataInitialization", request.dataInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationReserved)) {
            query.put("MigrationReserved", request.migrationReserved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureInitialization)) {
            query.put("StructureInitialization", request.structureInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobName)) {
            query.put("SynchronizationJobName", request.synchronizationJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpoint)) {
            query.put("DestinationEndpoint", request.destinationEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionKey)) {
            query.put("PartitionKey", request.partitionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationObjects)) {
            body.put("SynchronizationObjects", request.synchronizationObjects);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSynchronizationJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/49446.html">CreateSynchronizationJob</a> operation to create a data synchronization instance.</p>
     * <blockquote>
     * <ul>
     * <li>After this operation is called, the data synchronization instance automatically starts and performs a precheck. You do not need to call the <a href="https://help.aliyun.com/document_detail/49448.html">StartSynchronizationJob</a> operation to start the instance.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the data synchronization instance fails to start, the precheck may have failed. You can call the <a href="https://help.aliyun.com/document_detail/49453.html">DescribeSynchronizationJobStatus</a> operation to query the status of the data synchronization instance, obtain the error message of the precheck failure, and adjust the parameters. After the adjustment, you can call the <a href="https://help.aliyun.com/document_detail/49448.html">StartSynchronizationJob</a> operation to restart the data synchronization instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a data synchronization task by using the previous version.</p>
     * 
     * @param request ConfigureSynchronizationJobRequest
     * @return ConfigureSynchronizationJobResponse
     */
    public ConfigureSynchronizationJobResponse configureSynchronizationJob(ConfigureSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures monitoring and alerting to monitor the latency and exception status of a synchronization task.</p>
     * 
     * @param request ConfigureSynchronizationJobAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSynchronizationJobAlertResponse
     */
    public ConfigureSynchronizationJobAlertResponse configureSynchronizationJobAlertWithOptions(ConfigureSynchronizationJobAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertPhone)) {
            query.put("DelayAlertPhone", request.delayAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertStatus)) {
            query.put("DelayAlertStatus", request.delayAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayOverSeconds)) {
            query.put("DelayOverSeconds", request.delayOverSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertPhone)) {
            query.put("ErrorAlertPhone", request.errorAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertStatus)) {
            query.put("ErrorAlertStatus", request.errorAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSynchronizationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSynchronizationJobAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures monitoring and alerting to monitor the latency and exception status of a synchronization task.</p>
     * 
     * @param request ConfigureSynchronizationJobAlertRequest
     * @return ConfigureSynchronizationJobAlertResponse
     */
    public ConfigureSynchronizationJobAlertResponse configureSynchronizationJobAlert(ConfigureSynchronizationJobAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSynchronizationJobAlertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the full image matching switch for a data synchronization instance.</p>
     * 
     * @param request ConfigureSynchronizationJobReplicatorCompareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSynchronizationJobReplicatorCompareResponse
     */
    public ConfigureSynchronizationJobReplicatorCompareResponse configureSynchronizationJobReplicatorCompareWithOptions(ConfigureSynchronizationJobReplicatorCompareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationReplicatorCompareEnable)) {
            query.put("SynchronizationReplicatorCompareEnable", request.synchronizationReplicatorCompareEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSynchronizationJobReplicatorCompare"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSynchronizationJobReplicatorCompareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the full image matching switch for a data synchronization instance.</p>
     * 
     * @param request ConfigureSynchronizationJobReplicatorCompareRequest
     * @return ConfigureSynchronizationJobReplicatorCompareResponse
     */
    public ConfigureSynchronizationJobReplicatorCompareResponse configureSynchronizationJobReplicatorCompare(ConfigureSynchronizationJobReplicatorCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSynchronizationJobReplicatorCompareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Transfers a DTS instance to a different resource group.</p>
     * 
     * @param request ConvertInstanceResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConvertInstanceResourceGroupResponse
     */
    public ConvertInstanceResourceGroupResponse convertInstanceResourceGroupWithOptions(ConvertInstanceResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertInstanceResourceGroup"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertInstanceResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Transfers a DTS instance to a different resource group.</p>
     * 
     * @param request ConvertInstanceResourceGroupRequest
     * @return ConvertInstanceResourceGroupResponse
     */
    public ConvertInstanceResourceGroupResponse convertInstanceResourceGroup(ConvertInstanceResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertInstanceResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the count of tasks by conditions.</p>
     * 
     * @param request CountJobByConditionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CountJobByConditionResponse
     */
    public CountJobByConditionResponse countJobByConditionWithOptions(CountJobByConditionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destDbType)) {
            query.put("DestDbType", request.destDbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDbType)) {
            query.put("SrcDbType", request.srcDbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CountJobByCondition"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CountJobByConditionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the count of tasks by conditions.</p>
     * 
     * @param request CountJobByConditionRequest
     * @return CountJobByConditionResponse
     */
    public CountJobByConditionResponse countJobByCondition(CountJobByConditionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.countJobByConditionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a consumer group for a change tracking task (new version).</p>
     * 
     * @param request CreateConsumerChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsumerChannelResponse
     */
    public CreateConsumerChannelResponse createConsumerChannelWithOptions(CreateConsumerChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupName)) {
            query.put("ConsumerGroupName", request.consumerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupPassword)) {
            query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupUserName)) {
            query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerChannelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a consumer group for a change tracking task (new version).</p>
     * 
     * @param request CreateConsumerChannelRequest
     * @return CreateConsumerChannelResponse
     */
    public CreateConsumerChannelResponse createConsumerChannel(CreateConsumerChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConsumerChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a consumer group for a change tracking instance.</p>
     * 
     * @param request CreateConsumerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupName)) {
            query.put("ConsumerGroupName", request.consumerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupPassword)) {
            query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupUserName)) {
            query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerGroup"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a consumer group for a change tracking instance.</p>
     * 
     * @param request CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an alert rule by calling the CreateDedicatedClusterMonitorRule operation.</p>
     * 
     * @param request CreateDedicatedClusterMonitorRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDedicatedClusterMonitorRuleResponse
     */
    public CreateDedicatedClusterMonitorRuleResponse createDedicatedClusterMonitorRuleWithOptions(CreateDedicatedClusterMonitorRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuAlarmThreshold)) {
            query.put("CpuAlarmThreshold", request.cpuAlarmThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskAlarmThreshold)) {
            query.put("DiskAlarmThreshold", request.diskAlarmThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duAlarmThreshold)) {
            query.put("DuAlarmThreshold", request.duAlarmThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memAlarmThreshold)) {
            query.put("MemAlarmThreshold", request.memAlarmThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeSwitch)) {
            query.put("NoticeSwitch", request.noticeSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phones)) {
            query.put("Phones", request.phones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDedicatedClusterMonitorRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDedicatedClusterMonitorRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an alert rule by calling the CreateDedicatedClusterMonitorRule operation.</p>
     * 
     * @param request CreateDedicatedClusterMonitorRuleRequest
     * @return CreateDedicatedClusterMonitorRuleResponse
     */
    public CreateDedicatedClusterMonitorRuleResponse createDedicatedClusterMonitorRule(CreateDedicatedClusterMonitorRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDedicatedClusterMonitorRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation creates a document parsing task and returns a task ID (DtsJobId).</p>
     * <blockquote>
     * <ul>
     * <li>This operation relies on Object Storage Service (OSS) for file transfer. We recommend that you call this operation by using an SDK. The CreateDocParserJobAdvance operation automatically encapsulates the file transfer process.</li>
     * <li>After you obtain the DtsJobId response parameter, you can call the DescribeDocParserJobStatus operation to query the execution status of the document parsing task, and call the DescribeDocParserJobResult operation to obtain the output of the document parsing task.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a document parsing task.</p>
     * 
     * @param request CreateDocParserJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDocParserJobResponse
     */
    public CreateDocParserJobResponse createDocParserJobWithOptions(CreateDocParserJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ragInstanceId)) {
            query.put("RagInstanceId", request.ragInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultType)) {
            query.put("ResultType", request.resultType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDocParserJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDocParserJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation creates a document parsing task and returns a task ID (DtsJobId).</p>
     * <blockquote>
     * <ul>
     * <li>This operation relies on Object Storage Service (OSS) for file transfer. We recommend that you call this operation by using an SDK. The CreateDocParserJobAdvance operation automatically encapsulates the file transfer process.</li>
     * <li>After you obtain the DtsJobId response parameter, you can call the DescribeDocParserJobStatus operation to query the execution status of the document parsing task, and call the DescribeDocParserJobResult operation to obtain the output of the document parsing task.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a document parsing task.</p>
     * 
     * @param request CreateDocParserJobRequest
     * @return CreateDocParserJobResponse
     */
    public CreateDocParserJobResponse createDocParserJob(CreateDocParserJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDocParserJobWithOptions(request, runtime);
    }

    public CreateDocParserJobResponse createDocParserJobAdvance(CreateDocParserJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
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
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "Dts"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        CreateDocParserJobRequest createDocParserJobReq = new CreateDocParserJobRequest();
        com.aliyun.openapiutil.Client.convert(request, createDocParserJobReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            createDocParserJobReq.fileUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        CreateDocParserJobResponse createDocParserJobResp = this.createDocParserJobWithOptions(createDocParserJobReq, runtime);
        return createDocParserJobResp;
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before invoking this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of Data Transmission Service (DTS).
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Before invoking this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/product/data-transmission-service/pricing">pricing</a> of Data Transmission Service (DTS).</li>
     * <li>Nodes on a dedicated cluster support only the workflow of configuring a node before purchasing an instance. You can invoke the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to configure a node.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Purchases a DTS instance by calling the CreateDtsInstance operation.</p>
     * 
     * @param request CreateDtsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDtsInstanceResponse
     */
    public CreateDtsInstanceResponse createDtsInstanceWithOptions(CreateDtsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStart)) {
            query.put("AutoStart", request.autoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeUnit)) {
            query.put("ComputeUnit", request.computeUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseCount)) {
            query.put("DatabaseCount", request.databaseCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointEngineName)) {
            query.put("DestinationEndpointEngineName", request.destinationEndpointEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegion)) {
            query.put("DestinationRegion", request.destinationRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsRegion)) {
            query.put("DtsRegion", request.dtsRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.du)) {
            query.put("Du", request.du);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feeType)) {
            query.put("FeeType", request.feeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insightModule)) {
            query.put("InsightModule", request.insightModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDu)) {
            query.put("MaxDu", request.maxDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDu)) {
            query.put("MinDu", request.minDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointEngineName)) {
            query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegion)) {
            query.put("SourceRegion", request.sourceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncArchitecture)) {
            query.put("SyncArchitecture", request.syncArchitecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDtsInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDtsInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before invoking this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of Data Transmission Service (DTS).
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Before invoking this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/product/data-transmission-service/pricing">pricing</a> of Data Transmission Service (DTS).</li>
     * <li>Nodes on a dedicated cluster support only the workflow of configuring a node before purchasing an instance. You can invoke the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to configure a node.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Purchases a DTS instance by calling the CreateDtsInstance operation.</p>
     * 
     * @param request CreateDtsInstanceRequest
     * @return CreateDtsInstanceResponse
     */
    public CreateDtsInstanceResponse createDtsInstance(CreateDtsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDtsInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>DTS currently supports the following alert metrics: <strong>Latency</strong>, <strong>Migration Status</strong>, and <strong>Full Migration Duration</strong>:</p>
     * <ul>
     * <li><strong>Latency</strong>: Monitors incremental data migration latency. An alert is triggered when the migration latency, synchronization latency, or change tracking latency exceeds the specified threshold (in seconds).</li>
     * <li><strong>Migration Status</strong>: Monitors the task status. An alert is triggered when the task status is <strong>Error</strong> or <strong>Recovered</strong>.</li>
     * <li><strong>Full Migration Duration</strong>: Monitors the duration of full data migration. An alert is triggered when the duration exceeds the specified threshold (in hours).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies an alert rule for a DTS task.</p>
     * 
     * @param request CreateJobMonitorRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobMonitorRuleResponse
     */
    public CreateJobMonitorRuleResponse createJobMonitorRuleWithOptions(CreateJobMonitorRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delayRuleTime)) {
            query.put("DelayRuleTime", request.delayRuleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeValue)) {
            query.put("NoticeValue", request.noticeValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.times)) {
            query.put("Times", request.times);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJobMonitorRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobMonitorRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>DTS currently supports the following alert metrics: <strong>Latency</strong>, <strong>Migration Status</strong>, and <strong>Full Migration Duration</strong>:</p>
     * <ul>
     * <li><strong>Latency</strong>: Monitors incremental data migration latency. An alert is triggered when the migration latency, synchronization latency, or change tracking latency exceeds the specified threshold (in seconds).</li>
     * <li><strong>Migration Status</strong>: Monitors the task status. An alert is triggered when the task status is <strong>Error</strong> or <strong>Recovered</strong>.</li>
     * <li><strong>Full Migration Duration</strong>: Monitors the duration of full data migration. An alert is triggered when the duration exceeds the specified threshold (in hours).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies an alert rule for a DTS task.</p>
     * 
     * @param request CreateJobMonitorRuleRequest
     * @return CreateJobMonitorRuleResponse
     */
    public CreateJobMonitorRuleResponse createJobMonitorRule(CreateJobMonitorRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobMonitorRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Purchases a data migration instance.</p>
     * 
     * @param request CreateMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMigrationJobResponse
     */
    public CreateMigrationJobResponse createMigrationJobWithOptions(CreateMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobClass)) {
            query.put("MigrationJobClass", request.migrationJobClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMigrationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Purchases a data migration instance.</p>
     * 
     * @param request CreateMigrationJobRequest
     * @return CreateMigrationJobResponse
     */
    public CreateMigrationJobResponse createMigrationJob(CreateMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMigrationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The reverse task created by calling this operation immediately starts a precheck. After the precheck is passed, incremental data collection begins, but the incremental data write module does not run. You must call the <strong>StartReverseWriter</strong> operation to start it.</p>
     * <blockquote>
     * <p>The created reverse task is a synchronization task that contains only the incremental write module.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a reverse task for a specified synchronization or migration task by calling the CreateReverseDtsJob operation.</p>
     * 
     * @param request CreateReverseDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateReverseDtsJobResponse
     */
    public CreateReverseDtsJobResponse createReverseDtsJobWithOptions(CreateReverseDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardPassword)) {
            query.put("ShardPassword", request.shardPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardUsername)) {
            query.put("ShardUsername", request.shardUsername);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateReverseDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateReverseDtsJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>The reverse task created by calling this operation immediately starts a precheck. After the precheck is passed, incremental data collection begins, but the incremental data write module does not run. You must call the <strong>StartReverseWriter</strong> operation to start it.</p>
     * <blockquote>
     * <p>The created reverse task is a synchronization task that contains only the incremental write module.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a reverse task for a specified synchronization or migration task by calling the CreateReverseDtsJob operation.</p>
     * 
     * @param request CreateReverseDtsJobRequest
     * @return CreateReverseDtsJobResponse
     */
    public CreateReverseDtsJobResponse createReverseDtsJob(CreateReverseDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createReverseDtsJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a change tracking channel. This is a legacy operation.</p>
     * 
     * @param request CreateSubscriptionInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubscriptionInstanceResponse
     */
    public CreateSubscriptionInstanceResponse createSubscriptionInstanceWithOptions(CreateSubscriptionInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubscriptionInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a change tracking channel. This is a legacy operation.</p>
     * 
     * @param request CreateSubscriptionInstanceRequest
     * @return CreateSubscriptionInstanceResponse
     */
    public CreateSubscriptionInstanceResponse createSubscriptionInstance(CreateSubscriptionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSubscriptionInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data synchronization job instance. This is a legacy API operation.</p>
     * 
     * @param request CreateSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSynchronizationJobResponse
     */
    public CreateSynchronizationJobResponse createSynchronizationJobWithOptions(CreateSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceCount)) {
            query.put("DBInstanceCount", request.DBInstanceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destRegion)) {
            query.put("DestRegion", request.destRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegion)) {
            query.put("SourceRegion", request.sourceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobClass)) {
            query.put("SynchronizationJobClass", request.synchronizationJobClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topology)) {
            query.put("Topology", request.topology);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("networkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpoint)) {
            query.put("DestinationEndpoint", request.destinationEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSynchronizationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data synchronization job instance. This is a legacy API operation.</p>
     * 
     * @param request CreateSynchronizationJobRequest
     * @return CreateSynchronizationJobResponse
     */
    public CreateSynchronizationJobResponse createSynchronizationJob(CreateSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a consumer group of a change tracking task (new version).</p>
     * 
     * @param request DeleteConsumerChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumerChannelResponse
     */
    public DeleteConsumerChannelResponse deleteConsumerChannelWithOptions(DeleteConsumerChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupId)) {
            query.put("ConsumerGroupId", request.consumerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerChannelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a consumer group of a change tracking task (new version).</p>
     * 
     * @param request DeleteConsumerChannelRequest
     * @return DeleteConsumerChannelResponse
     */
    public DeleteConsumerChannelResponse deleteConsumerChannel(DeleteConsumerChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConsumerChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a consumer group from a change tracking channel.</p>
     * 
     * @param request DeleteConsumerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupID)) {
            query.put("ConsumerGroupID", request.consumerGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerGroup"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a consumer group from a change tracking channel.</p>
     * 
     * @param request DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;<ph>Subscription DTS instances cannot be released by calling this API operation. You can release them by unsubscribing. For more information, see <a href="https://help.aliyun.com/document_detail/289054.html">Release a DTS instance</a>.</ph>&lt;props=&quot;intl&quot;&gt;<ph>Subscription DTS instances cannot be released.</ph>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Releases a data migration, synchronization, or change tracking instance.</p>
     * 
     * @param request DeleteDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDtsJobResponse
     */
    public DeleteDtsJobResponse deleteDtsJobWithOptions(DeleteDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDtsJobResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;<ph>Subscription DTS instances cannot be released by calling this API operation. You can release them by unsubscribing. For more information, see <a href="https://help.aliyun.com/document_detail/289054.html">Release a DTS instance</a>.</ph>&lt;props=&quot;intl&quot;&gt;<ph>Subscription DTS instances cannot be released.</ph>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Releases a data migration, synchronization, or change tracking instance.</p>
     * 
     * @param request DeleteDtsJobRequest
     * @return DeleteDtsJobResponse
     */
    public DeleteDtsJobResponse deleteDtsJob(DeleteDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDtsJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;<ph>Subscription DTS instances cannot be released by calling API operations. You can release them by unsubscribing. For more information, see <a href="https://help.aliyun.com/document_detail/289054.html">Release a DTS instance</a>.</ph>&lt;props=&quot;intl&quot;&gt;<ph>Subscription DTS instances cannot be released.</ph>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Releases data migration, data synchronization, or change tracking tasks in batches by calling the DeleteDtsJobs operation.</p>
     * 
     * @param request DeleteDtsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDtsJobsResponse
     */
    public DeleteDtsJobsResponse deleteDtsJobsWithOptions(DeleteDtsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobIds)) {
            query.put("DtsJobIds", request.dtsJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDtsJobsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;<ph>Subscription DTS instances cannot be released by calling API operations. You can release them by unsubscribing. For more information, see <a href="https://help.aliyun.com/document_detail/289054.html">Release a DTS instance</a>.</ph>&lt;props=&quot;intl&quot;&gt;<ph>Subscription DTS instances cannot be released.</ph>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Releases data migration, data synchronization, or change tracking tasks in batches by calling the DeleteDtsJobs operation.</p>
     * 
     * @param request DeleteDtsJobsRequest
     * @return DeleteDtsJobsResponse
     */
    public DeleteDtsJobsResponse deleteDtsJobs(DeleteDtsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDtsJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a data migration instance.</p>
     * 
     * @param request DeleteMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMigrationJobResponse
     */
    public DeleteMigrationJobResponse deleteMigrationJobWithOptions(DeleteMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMigrationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a data migration instance.</p>
     * 
     * @param request DeleteMigrationJobRequest
     * @return DeleteMigrationJobResponse
     */
    public DeleteMigrationJobResponse deleteMigrationJob(DeleteMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMigrationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases the channel of a change tracking instance.</p>
     * 
     * @param request DeleteSubscriptionInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSubscriptionInstanceResponse
     */
    public DeleteSubscriptionInstanceResponse deleteSubscriptionInstanceWithOptions(DeleteSubscriptionInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubscriptionInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases the channel of a change tracking instance.</p>
     * 
     * @param request DeleteSubscriptionInstanceRequest
     * @return DeleteSubscriptionInstanceResponse
     */
    public DeleteSubscriptionInstanceResponse deleteSubscriptionInstance(DeleteSubscriptionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSubscriptionInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a data synchronization instance.</p>
     * 
     * @param request DeleteSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSynchronizationJobResponse
     */
    public DeleteSynchronizationJobResponse deleteSynchronizationJobWithOptions(DeleteSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSynchronizationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a data synchronization instance.</p>
     * 
     * @param request DeleteSynchronizationJobRequest
     * @return DeleteSynchronizationJobResponse
     */
    public DeleteSynchronizationJobResponse deleteSynchronizationJob(DeleteSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据投递链路store账号</p>
     * 
     * @param request DescribeChannelAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelAccountResponse
     */
    public DescribeChannelAccountResponse describeChannelAccountWithOptions(DescribeChannelAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelAccount"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据投递链路store账号</p>
     * 
     * @param request DescribeChannelAccountRequest
     * @return DescribeChannelAccountResponse
     */
    public DescribeChannelAccountResponse describeChannelAccount(DescribeChannelAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Contains data validation tasks associated with data migration tasks and data synchronization tasks.</p>
     * 
     * @param request DescribeCheckJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCheckJobsResponse
     */
    public DescribeCheckJobsResponse describeCheckJobsWithOptions(DescribeCheckJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkJobId)) {
            query.put("CheckJobId", request.checkJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCheckJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCheckJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Contains data validation tasks associated with data migration tasks and data synchronization tasks.</p>
     * 
     * @param request DescribeCheckJobsRequest
     * @return DescribeCheckJobsResponse
     */
    public DescribeCheckJobsResponse describeCheckJobs(DescribeCheckJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCheckJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log information of a DTS cluster by calling the DescribeClusterOperateLogs operation.</p>
     * 
     * @param request DescribeClusterOperateLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterOperateLogsResponse
     */
    public DescribeClusterOperateLogsResponse describeClusterOperateLogsWithOptions(DescribeClusterOperateLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            body.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            body.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerID)) {
            body.put("OwnerID", request.ownerID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterOperateLogs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterOperateLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log information of a DTS cluster by calling the DescribeClusterOperateLogs operation.</p>
     * 
     * @param request DescribeClusterOperateLogsRequest
     * @return DescribeClusterOperateLogsResponse
     */
    public DescribeClusterOperateLogsResponse describeClusterOperateLogs(DescribeClusterOperateLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterOperateLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the current usage of a cluster by calling the DescribeClusterUsedUtilization operation.</p>
     * 
     * @param request DescribeClusterUsedUtilizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterUsedUtilizationResponse
     */
    public DescribeClusterUsedUtilizationResponse describeClusterUsedUtilizationWithOptions(DescribeClusterUsedUtilizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            body.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            body.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            body.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerID)) {
            body.put("OwnerID", request.ownerID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterUsedUtilization"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterUsedUtilizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the current usage of a cluster by calling the DescribeClusterUsedUtilization operation.</p>
     * 
     * @param request DescribeClusterUsedUtilizationRequest
     * @return DescribeClusterUsedUtilizationResponse
     */
    public DescribeClusterUsedUtilizationResponse describeClusterUsedUtilization(DescribeClusterUsedUtilizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterUsedUtilizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Tests the connectivity between the execution node of a data migration task and the source and destination databases.</p>
     * 
     * @param request DescribeConnectionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConnectionStatusResponse
     */
    public DescribeConnectionStatusResponse describeConnectionStatusWithOptions(DescribeConnectionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointArchitecture)) {
            query.put("DestinationEndpointArchitecture", request.destinationEndpointArchitecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointDatabaseName)) {
            query.put("DestinationEndpointDatabaseName", request.destinationEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointEngineName)) {
            query.put("DestinationEndpointEngineName", request.destinationEndpointEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointIP)) {
            query.put("DestinationEndpointIP", request.destinationEndpointIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointInstanceID)) {
            query.put("DestinationEndpointInstanceID", request.destinationEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointInstanceType)) {
            query.put("DestinationEndpointInstanceType", request.destinationEndpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointOracleSID)) {
            query.put("DestinationEndpointOracleSID", request.destinationEndpointOracleSID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointPassword)) {
            query.put("DestinationEndpointPassword", request.destinationEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointPort)) {
            query.put("DestinationEndpointPort", request.destinationEndpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointRegion)) {
            query.put("DestinationEndpointRegion", request.destinationEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointUserName)) {
            query.put("DestinationEndpointUserName", request.destinationEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointArchitecture)) {
            query.put("SourceEndpointArchitecture", request.sourceEndpointArchitecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointDatabaseName)) {
            query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointEngineName)) {
            query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointIP)) {
            query.put("SourceEndpointIP", request.sourceEndpointIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceID)) {
            query.put("SourceEndpointInstanceID", request.sourceEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceType)) {
            query.put("SourceEndpointInstanceType", request.sourceEndpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointOracleSID)) {
            query.put("SourceEndpointOracleSID", request.sourceEndpointOracleSID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPassword)) {
            query.put("SourceEndpointPassword", request.sourceEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPort)) {
            query.put("SourceEndpointPort", request.sourceEndpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointUserName)) {
            query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConnectionStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConnectionStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Tests the connectivity between the execution node of a data migration task and the source and destination databases.</p>
     * 
     * @param request DescribeConnectionStatusRequest
     * @return DescribeConnectionStatusResponse
     */
    public DescribeConnectionStatusResponse describeConnectionStatus(DescribeConnectionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConnectionStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the consumer group information of a DTS change tracking task, such as the consumer group ID, name, account, and consumption latency.</p>
     * 
     * @param request DescribeConsumerChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsumerChannelResponse
     */
    public DescribeConsumerChannelResponse describeConsumerChannelWithOptions(DescribeConsumerChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentChannelId)) {
            query.put("ParentChannelId", request.parentChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsumerChannelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the consumer group information of a DTS change tracking task, such as the consumer group ID, name, account, and consumption latency.</p>
     * 
     * @param request DescribeConsumerChannelRequest
     * @return DescribeConsumerChannelResponse
     */
    public DescribeConsumerChannelResponse describeConsumerChannel(DescribeConsumerChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsumerChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of consumer groups in a change tracking instance.</p>
     * 
     * @param request DescribeConsumerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsumerGroupResponse
     */
    public DescribeConsumerGroupResponse describeConsumerGroupWithOptions(DescribeConsumerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConsumerGroup"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsumerGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of consumer groups in a change tracking instance.</p>
     * 
     * @param request DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     */
    public DescribeConsumerGroupResponse describeConsumerGroup(DescribeConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsumerGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the DTS IP addresses that must be added to the whitelists of both the source and destination databases.</p>
     * 
     * @param request DescribeDTSIPRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDTSIPResponse
     */
    public DescribeDTSIPResponse describeDTSIPWithOptions(DescribeDTSIPRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointRegion)) {
            query.put("DestinationEndpointRegion", request.destinationEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDTSIP"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDTSIPResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the DTS IP addresses that must be added to the whitelists of both the source and destination databases.</p>
     * 
     * @param request DescribeDTSIPRequest
     * @return DescribeDTSIPResponse
     */
    public DescribeDTSIPResponse describeDTSIP(DescribeDTSIPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDTSIPWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the download URL for the list data of inconsistent data.</p>
     * 
     * @param request DescribeDataCheckReportUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataCheckReportUrlResponse
     */
    public DescribeDataCheckReportUrlResponse describeDataCheckReportUrlWithOptions(DescribeDataCheckReportUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbName)) {
            query.put("TbName", request.tbName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataCheckReportUrl"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataCheckReportUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the download URL for the list data of inconsistent data.</p>
     * 
     * @param request DescribeDataCheckReportUrlRequest
     * @return DescribeDataCheckReportUrlResponse
     */
    public DescribeDataCheckReportUrlResponse describeDataCheckReportUrl(DescribeDataCheckReportUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataCheckReportUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data consistency verification results at the table level.</p>
     * 
     * @param request DescribeDataCheckTableDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataCheckTableDetailsResponse
     */
    public DescribeDataCheckTableDetailsResponse describeDataCheckTableDetailsWithOptions(DescribeDataCheckTableDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataCheckTableDetails"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataCheckTableDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data consistency verification results at the table level.</p>
     * 
     * @param request DescribeDataCheckTableDetailsRequest
     * @return DescribeDataCheckTableDetailsResponse
     */
    public DescribeDataCheckTableDetailsResponse describeDataCheckTableDetails(DescribeDataCheckTableDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataCheckTableDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists data inconsistency results grouped by inconsistent data.</p>
     * 
     * @param request DescribeDataCheckTableDiffDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataCheckTableDiffDetailsResponse
     */
    public DescribeDataCheckTableDiffDetailsResponse describeDataCheckTableDiffDetailsWithOptions(DescribeDataCheckTableDiffDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbName)) {
            query.put("TbName", request.tbName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataCheckTableDiffDetails"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataCheckTableDiffDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists data inconsistency results grouped by inconsistent data.</p>
     * 
     * @param request DescribeDataCheckTableDiffDetailsRequest
     * @return DescribeDataCheckTableDiffDetailsResponse
     */
    public DescribeDataCheckTableDiffDetailsResponse describeDataCheckTableDiffDetails(DescribeDataCheckTableDiffDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataCheckTableDiffDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified cluster by calling the DescribeDedicatedCluster operation.</p>
     * 
     * @param request DescribeDedicatedClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDedicatedClusterResponse
     */
    public DescribeDedicatedClusterResponse describeDedicatedClusterWithOptions(DescribeDedicatedClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedCluster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified cluster by calling the DescribeDedicatedCluster operation.</p>
     * 
     * @param request DescribeDedicatedClusterRequest
     * @return DescribeDedicatedClusterResponse
     */
    public DescribeDedicatedClusterResponse describeDedicatedCluster(DescribeDedicatedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert rules by calling the DescribeDedicatedClusterMonitorRule operation.</p>
     * 
     * @param request DescribeDedicatedClusterMonitorRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDedicatedClusterMonitorRuleResponse
     */
    public DescribeDedicatedClusterMonitorRuleResponse describeDedicatedClusterMonitorRuleWithOptions(DescribeDedicatedClusterMonitorRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedClusterMonitorRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedClusterMonitorRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert rules by calling the DescribeDedicatedClusterMonitorRule operation.</p>
     * 
     * @param request DescribeDedicatedClusterMonitorRuleRequest
     * @return DescribeDedicatedClusterMonitorRuleResponse
     */
    public DescribeDedicatedClusterMonitorRuleResponse describeDedicatedClusterMonitorRule(DescribeDedicatedClusterMonitorRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedClusterMonitorRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative call threshold per region is 100 calls per second.</li>
     * <li>The call threshold per account per region is 5 calls per second.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the result of a document parsing task.</p>
     * 
     * @param request DescribeDocParserJobResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDocParserJobResultResponse
     */
    public DescribeDocParserJobResultResponse describeDocParserJobResultWithOptions(DescribeDocParserJobResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ragInstanceId)) {
            query.put("RagInstanceId", request.ragInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDocParserJobResult"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDocParserJobResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative call threshold per region is 100 calls per second.</li>
     * <li>The call threshold per account per region is 5 calls per second.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the result of a document parsing task.</p>
     * 
     * @param request DescribeDocParserJobResultRequest
     * @return DescribeDocParserJobResultResponse
     */
    public DescribeDocParserJobResultResponse describeDocParserJobResult(DescribeDocParserJobResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDocParserJobResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation has call frequency limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative call threshold for a single region is 200 calls per second.</li>
     * <li>The call threshold for a single account in a single region is 20 calls per second.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution status of a document parsing task.</p>
     * 
     * @param request DescribeDocParserJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDocParserJobStatusResponse
     */
    public DescribeDocParserJobStatusResponse describeDocParserJobStatusWithOptions(DescribeDocParserJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ragInstanceId)) {
            query.put("RagInstanceId", request.ragInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDocParserJobStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDocParserJobStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation has call frequency limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative call threshold for a single region is 200 calls per second.</li>
     * <li>The call threshold for a single account in a single region is 20 calls per second.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution status of a document parsing task.</p>
     * 
     * @param request DescribeDocParserJobStatusRequest
     * @return DescribeDocParserJobStatusResponse
     */
    public DescribeDocParserJobStatusResponse describeDocParserJobStatus(DescribeDocParserJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDocParserJobStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an ETL task.</p>
     * 
     * @param request DescribeDtsEtlJobVersionInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDtsEtlJobVersionInfoResponse
     */
    public DescribeDtsEtlJobVersionInfoResponse describeDtsEtlJobVersionInfoWithOptions(DescribeDtsEtlJobVersionInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsEtlJobVersionInfo"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsEtlJobVersionInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an ETL task.</p>
     * 
     * @param request DescribeDtsEtlJobVersionInfoRequest
     * @return DescribeDtsEtlJobVersionInfoResponse
     */
    public DescribeDtsEtlJobVersionInfoResponse describeDtsEtlJobVersionInfo(DescribeDtsEtlJobVersionInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDtsEtlJobVersionInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询DTS任务配置</p>
     * 
     * @param request DescribeDtsJobConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDtsJobConfigResponse
     */
    public DescribeDtsJobConfigResponse describeDtsJobConfigWithOptions(DescribeDtsJobConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forAcceleration)) {
            query.put("ForAcceleration", request.forAcceleration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            query.put("Module", request.module);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsJobConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsJobConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询DTS任务配置</p>
     * 
     * @param request DescribeDtsJobConfigRequest
     * @return DescribeDtsJobConfigResponse
     */
    public DescribeDtsJobConfigResponse describeDtsJobConfig(DescribeDtsJobConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDtsJobConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative threshold for calls in a single region is 160 calls per second.</li>
     * <li>The threshold for calls by a single account in a single region is 40 calls per second.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a DTS task by calling DescribeDtsJobDetail.</p>
     * 
     * @param request DescribeDtsJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDtsJobDetailResponse
     */
    public DescribeDtsJobDetailResponse describeDtsJobDetailWithOptions(DescribeDtsJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbObjectOutputType)) {
            query.put("DbObjectOutputType", request.dbObjectOutputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceID)) {
            query.put("DtsInstanceID", request.dtsInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncSubJobHistory)) {
            query.put("SyncSubJobHistory", request.syncSubJobHistory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsJobDetail"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsJobDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative threshold for calls in a single region is 160 calls per second.</li>
     * <li>The threshold for calls by a single account in a single region is 40 calls per second.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a DTS task by calling DescribeDtsJobDetail.</p>
     * 
     * @param request DescribeDtsJobDetailRequest
     * @return DescribeDtsJobDetailResponse
     */
    public DescribeDtsJobDetailResponse describeDtsJobDetail(DescribeDtsJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDtsJobDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative threshold for calls in a single region is 200 calls per second.</li>
     * <li>The threshold for calls by a single account in a single region is 20 calls per second.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of DTS tasks and the execution details of each task.</p>
     * 
     * @param request DescribeDtsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDtsJobsResponse
     */
    public DescribeDtsJobsResponse describeDtsJobsWithOptions(DescribeDtsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destProductType)) {
            query.put("DestProductType", request.destProductType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsBisLabel)) {
            query.put("DtsBisLabel", request.dtsBisLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("OrderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcProductType)) {
            query.put("SrcProductType", request.srcProductType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withoutDbList)) {
            query.put("WithoutDbList", request.withoutDbList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation has rate limits. Calls that exceed the limits are rejected.</p>
     * <ul>
     * <li>The cumulative threshold for calls in a single region is 200 calls per second.</li>
     * <li>The threshold for calls by a single account in a single region is 20 calls per second.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of DTS tasks and the execution details of each task.</p>
     * 
     * @param request DescribeDtsJobsRequest
     * @return DescribeDtsJobsResponse
     */
    public DescribeDtsJobsResponse describeDtsJobs(DescribeDtsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDtsJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log information of a data migration or synchronization task.</p>
     * 
     * @param request DescribeDtsServiceLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDtsServiceLogResponse
     */
    public DescribeDtsServiceLogResponse describeDtsServiceLogWithOptions(DescribeDtsServiceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subJobType)) {
            query.put("SubJobType", request.subJobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsServiceLog"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsServiceLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log information of a data migration or synchronization task.</p>
     * 
     * @param request DescribeDtsServiceLogRequest
     * @return DescribeDtsServiceLogResponse
     */
    public DescribeDtsServiceLogResponse describeDtsServiceLog(DescribeDtsServiceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDtsServiceLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status of a task.</p>
     * 
     * @param request DescribeEndpointSwitchStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEndpointSwitchStatusResponse
     */
    public DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatusWithOptions(DescribeEndpointSwitchStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEndpointSwitchStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEndpointSwitchStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status of a task.</p>
     * 
     * @param request DescribeEndpointSwitchStatusRequest
     * @return DescribeEndpointSwitchStatusResponse
     */
    public DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatus(DescribeEndpointSwitchStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEndpointSwitchStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the running logs of an ETL task.</p>
     * 
     * @param request DescribeEtlJobLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEtlJobLogsResponse
     */
    public DescribeEtlJobLogsResponse describeEtlJobLogsWithOptions(DescribeEtlJobLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEtlJobLogs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEtlJobLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the running logs of an ETL task.</p>
     * 
     * @param request DescribeEtlJobLogsRequest
     * @return DescribeEtlJobLogsResponse
     */
    public DescribeEtlJobLogsResponse describeEtlJobLogs(DescribeEtlJobLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEtlJobLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the running details of a full data migration task.</p>
     * 
     * @param request DescribeFullProcessListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFullProcessListResponse
     */
    public DescribeFullProcessListResponse describeFullProcessListWithOptions(DescribeFullProcessListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFullProcessList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFullProcessListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the running details of a full data migration task.</p>
     * 
     * @param request DescribeFullProcessListRequest
     * @return DescribeFullProcessListResponse
     */
    public DescribeFullProcessListResponse describeFullProcessList(DescribeFullProcessListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFullProcessListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Global Active Database (GAD) instances.</p>
     * 
     * @param request DescribeGadInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGadInstancesResponse
     */
    public DescribeGadInstancesResponse describeGadInstancesWithOptions(DescribeGadInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbEngineTypes)) {
            query.put("DbEngineTypes", request.dbEngineTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterDbInstanceId)) {
            query.put("MasterDbInstanceId", request.masterDbInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveDbInstanceId)) {
            query.put("SlaveDbInstanceId", request.slaveDbInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGadInstances"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGadInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Global Active Database (GAD) instances.</p>
     * 
     * @param request DescribeGadInstancesRequest
     * @return DescribeGadInstancesResponse
     */
    public DescribeGadInstancesResponse describeGadInstances(DescribeGadInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGadInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the initialization status. This is an earlier version of the operation.</p>
     * 
     * @param request DescribeInitializationStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInitializationStatusResponse
     */
    public DescribeInitializationStatusResponse describeInitializationStatusWithOptions(DescribeInitializationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInitializationStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInitializationStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the initialization status. This is an earlier version of the operation.</p>
     * 
     * @param request DescribeInitializationStatusRequest
     * @return DescribeInitializationStatusResponse
     */
    public DescribeInitializationStatusResponse describeInitializationStatus(DescribeInitializationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInitializationStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alert rules of a DTS task by calling DescribeJobMonitorRule.</p>
     * 
     * @param request DescribeJobMonitorRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobMonitorRuleResponse
     */
    public DescribeJobMonitorRuleResponse describeJobMonitorRuleWithOptions(DescribeJobMonitorRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobMonitorRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobMonitorRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alert rules of a DTS task by calling DescribeJobMonitorRule.</p>
     * 
     * @param request DescribeJobMonitorRuleRequest
     * @return DescribeJobMonitorRuleResponse
     */
    public DescribeJobMonitorRuleResponse describeJobMonitorRule(DescribeJobMonitorRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobMonitorRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cluster monitoring information by calling the DescribeMetricList operation.</p>
     * 
     * @param request DescribeMetricListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricListResponse
     */
    public DescribeMetricListResponse describeMetricListWithOptions(DescribeMetricListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            body.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            body.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            body.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerID)) {
            body.put("OwnerID", request.ownerID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            body.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cluster monitoring information by calling the DescribeMetricList operation.</p>
     * 
     * @param request DescribeMetricListRequest
     * @return DescribeMetricListResponse
     */
    public DescribeMetricListResponse describeMetricList(DescribeMetricListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring and alert settings of a data migration task.</p>
     * 
     * @param request DescribeMigrationJobAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMigrationJobAlertResponse
     */
    public DescribeMigrationJobAlertResponse describeMigrationJobAlertWithOptions(DescribeMigrationJobAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring and alert settings of a data migration task.</p>
     * 
     * @param request DescribeMigrationJobAlertRequest
     * @return DescribeMigrationJobAlertResponse
     */
    public DescribeMigrationJobAlertResponse describeMigrationJobAlert(DescribeMigrationJobAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrationJobAlertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution details of a data migration task. This is a legacy operation.</p>
     * 
     * @param request DescribeMigrationJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMigrationJobDetailResponse
     */
    public DescribeMigrationJobDetailResponse describeMigrationJobDetailWithOptions(DescribeMigrationJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationMode)) {
            query.put("MigrationMode", request.migrationMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobDetail"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution details of a data migration task. This is a legacy operation.</p>
     * 
     * @param request DescribeMigrationJobDetailRequest
     * @return DescribeMigrationJobDetailResponse
     */
    public DescribeMigrationJobDetailResponse describeMigrationJobDetail(DescribeMigrationJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrationJobDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a data migration task. This is a legacy operation.</p>
     * 
     * @param request DescribeMigrationJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMigrationJobStatusResponse
     */
    public DescribeMigrationJobStatusResponse describeMigrationJobStatusWithOptions(DescribeMigrationJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a data migration task. This is a legacy operation.</p>
     * 
     * @param request DescribeMigrationJobStatusRequest
     * @return DescribeMigrationJobStatusResponse
     */
    public DescribeMigrationJobStatusResponse describeMigrationJobStatus(DescribeMigrationJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrationJobStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of data migration instances and details of each migration instance.</p>
     * 
     * @param request DescribeMigrationJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMigrationJobsResponse
     */
    public DescribeMigrationJobsResponse describeMigrationJobsWithOptions(DescribeMigrationJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobName)) {
            query.put("MigrationJobName", request.migrationJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of data migration instances and details of each migration instance.</p>
     * 
     * @param request DescribeMigrationJobsRequest
     * @return DescribeMigrationJobsResponse
     */
    public DescribeMigrationJobsResponse describeMigrationJobs(DescribeMigrationJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrationJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the task result of a precheck for creating a Global Active Database (GAD) order node.</p>
     * 
     * @param request DescribePreCheckCreateGadOrderResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePreCheckCreateGadOrderResultResponse
     */
    public DescribePreCheckCreateGadOrderResultResponse describePreCheckCreateGadOrderResultWithOptions(DescribePreCheckCreateGadOrderResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePreCheckCreateGadOrderResult"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePreCheckCreateGadOrderResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the task result of a precheck for creating a Global Active Database (GAD) order node.</p>
     * 
     * @param request DescribePreCheckCreateGadOrderResultRequest
     * @return DescribePreCheckCreateGadOrderResultResponse
     */
    public DescribePreCheckCreateGadOrderResultResponse describePreCheckCreateGadOrderResult(DescribePreCheckCreateGadOrderResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePreCheckCreateGadOrderResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution details of subtasks of a DTS task, including precheck, schema migration or synchronization, full data migration or synchronization, and incremental data migration or synchronization.</p>
     * 
     * @param request DescribePreCheckStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePreCheckStatusResponse
     */
    public DescribePreCheckStatusResponse describePreCheckStatusWithOptions(DescribePreCheckStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobCode)) {
            query.put("JobCode", request.jobCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structPhase)) {
            query.put("StructPhase", request.structPhase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structType)) {
            query.put("StructType", request.structType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePreCheckStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePreCheckStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution details of subtasks of a DTS task, including precheck, schema migration or synchronization, full data migration or synchronization, and incremental data migration or synchronization.</p>
     * 
     * @param request DescribePreCheckStatusRequest
     * @return DescribePreCheckStatusResponse
     */
    public DescribePreCheckStatusResponse describePreCheckStatus(DescribePreCheckStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePreCheckStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring and alerting settings of a change tracking instance.</p>
     * 
     * @param request DescribeSubscriptionInstanceAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubscriptionInstanceAlertResponse
     */
    public DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlertWithOptions(DescribeSubscriptionInstanceAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionInstanceAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionInstanceAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring and alerting settings of a change tracking instance.</p>
     * 
     * @param request DescribeSubscriptionInstanceAlertRequest
     * @return DescribeSubscriptionInstanceAlertResponse
     */
    public DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlert(DescribeSubscriptionInstanceAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSubscriptionInstanceAlertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instance status details of a change tracking channel. This is a legacy operation.</p>
     * 
     * @param request DescribeSubscriptionInstanceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubscriptionInstanceStatusResponse
     */
    public DescribeSubscriptionInstanceStatusResponse describeSubscriptionInstanceStatusWithOptions(DescribeSubscriptionInstanceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionInstanceStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionInstanceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instance status details of a change tracking channel. This is a legacy operation.</p>
     * 
     * @param request DescribeSubscriptionInstanceStatusRequest
     * @return DescribeSubscriptionInstanceStatusResponse
     */
    public DescribeSubscriptionInstanceStatusResponse describeSubscriptionInstanceStatus(DescribeSubscriptionInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSubscriptionInstanceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of change tracking instances and the details of each instance.</p>
     * 
     * @param request DescribeSubscriptionInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubscriptionInstancesResponse
     */
    public DescribeSubscriptionInstancesResponse describeSubscriptionInstancesWithOptions(DescribeSubscriptionInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceName)) {
            query.put("SubscriptionInstanceName", request.subscriptionInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionInstances"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of change tracking instances and the details of each instance.</p>
     * 
     * @param request DescribeSubscriptionInstancesRequest
     * @return DescribeSubscriptionInstancesResponse
     */
    public DescribeSubscriptionInstancesResponse describeSubscriptionInstances(DescribeSubscriptionInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSubscriptionInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Because a PolarDB-X 1.0 change tracking task is a distributed change tracking task, each ApsaraDB RDS for MySQL instance associated with the task corresponds to a change tracking subtask. You can call this operation to query the information about change tracking subtasks.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID, consumer group ID, and other information about a PolarDB-X 1.0 change tracking task.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Because a DRDS change tracking task is a distributed change tracking task, each ApsaraDB RDS for MySQL instance associated with the task corresponds to a change tracking subtask. You can call this operation to query the information about change tracking subtasks.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID, consumer group ID, and other information about a DRDS change tracking task.
     * .</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about subtasks of a PolarDB-X 1.0 distributed change tracking task.</p>
     * 
     * @param tmpReq DescribeSubscriptionMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubscriptionMetaResponse
     */
    public DescribeSubscriptionMetaResponse describeSubscriptionMetaWithOptions(DescribeSubscriptionMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSubscriptionMetaShrinkRequest request = new DescribeSubscriptionMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subMigrationJobIds)) {
            request.subMigrationJobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subMigrationJobIds, "SubMigrationJobIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.topics)) {
            request.topicsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.topics, "Topics", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sid)) {
            query.put("Sid", request.sid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subMigrationJobIdsShrink)) {
            query.put("SubMigrationJobIds", request.subMigrationJobIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicsShrink)) {
            query.put("Topics", request.topicsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionMeta"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Because a PolarDB-X 1.0 change tracking task is a distributed change tracking task, each ApsaraDB RDS for MySQL instance associated with the task corresponds to a change tracking subtask. You can call this operation to query the information about change tracking subtasks.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID, consumer group ID, and other information about a PolarDB-X 1.0 change tracking task.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Because a DRDS change tracking task is a distributed change tracking task, each ApsaraDB RDS for MySQL instance associated with the task corresponds to a change tracking subtask. You can call this operation to query the information about change tracking subtasks.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID, consumer group ID, and other information about a DRDS change tracking task.
     * .</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about subtasks of a PolarDB-X 1.0 distributed change tracking task.</p>
     * 
     * @param request DescribeSubscriptionMetaRequest
     * @return DescribeSubscriptionMetaResponse
     */
    public DescribeSubscriptionMetaResponse describeSubscriptionMeta(DescribeSubscriptionMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSubscriptionMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看同步和迁移任务的增量写入延迟信息</p>
     * 
     * @param request DescribeSyncStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSyncStatusResponse
     */
    public DescribeSyncStatusResponse describeSyncStatusWithOptions(DescribeSyncStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSyncStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSyncStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看同步和迁移任务的增量写入延迟信息</p>
     * 
     * @param request DescribeSyncStatusRequest
     * @return DescribeSyncStatusResponse
     */
    public DescribeSyncStatusResponse describeSyncStatus(DescribeSyncStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSyncStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring and alerting settings of a synchronization task.</p>
     * 
     * @param request DescribeSynchronizationJobAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationJobAlertResponse
     */
    public DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlertWithOptions(DescribeSynchronizationJobAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the monitoring and alerting settings of a synchronization task.</p>
     * 
     * @param request DescribeSynchronizationJobAlertRequest
     * @return DescribeSynchronizationJobAlertResponse
     */
    public DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlert(DescribeSynchronizationJobAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobAlertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the current image matching switch configuration. This is a legacy operation.</p>
     * 
     * @param request DescribeSynchronizationJobReplicatorCompareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationJobReplicatorCompareResponse
     */
    public DescribeSynchronizationJobReplicatorCompareResponse describeSynchronizationJobReplicatorCompareWithOptions(DescribeSynchronizationJobReplicatorCompareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobReplicatorCompare"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobReplicatorCompareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the current image matching switch configuration. This is a legacy operation.</p>
     * 
     * @param request DescribeSynchronizationJobReplicatorCompareRequest
     * @return DescribeSynchronizationJobReplicatorCompareResponse
     */
    public DescribeSynchronizationJobReplicatorCompareResponse describeSynchronizationJobReplicatorCompare(DescribeSynchronizationJobReplicatorCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobReplicatorCompareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the running status of a data synchronization task. This is a legacy API operation.</p>
     * 
     * @param request DescribeSynchronizationJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationJobStatusResponse
     */
    public DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatusWithOptions(DescribeSynchronizationJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the running status of a data synchronization task. This is a legacy API operation.</p>
     * 
     * @param request DescribeSynchronizationJobStatusRequest
     * @return DescribeSynchronizationJobStatusResponse
     */
    public DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatus(DescribeSynchronizationJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status list of synchronization jobs. This is a legacy operation.</p>
     * 
     * @param request DescribeSynchronizationJobStatusListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationJobStatusListResponse
     */
    public DescribeSynchronizationJobStatusListResponse describeSynchronizationJobStatusListWithOptions(DescribeSynchronizationJobStatusListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobIdListJsonStr)) {
            query.put("SynchronizationJobIdListJsonStr", request.synchronizationJobIdListJsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobStatusList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobStatusListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status list of synchronization jobs. This is a legacy operation.</p>
     * 
     * @param request DescribeSynchronizationJobStatusListRequest
     * @return DescribeSynchronizationJobStatusListResponse
     */
    public DescribeSynchronizationJobStatusListResponse describeSynchronizationJobStatusList(DescribeSynchronizationJobStatusListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobStatusListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of data synchronization instances and the details of each instance by calling DescribeSynchronizationJobs.</p>
     * 
     * @param request DescribeSynchronizationJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationJobsResponse
     */
    public DescribeSynchronizationJobsResponse describeSynchronizationJobsWithOptions(DescribeSynchronizationJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobName)) {
            query.put("SynchronizationJobName", request.synchronizationJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of data synchronization instances and the details of each instance by calling DescribeSynchronizationJobs.</p>
     * 
     * @param request DescribeSynchronizationJobsRequest
     * @return DescribeSynchronizationJobsResponse
     */
    public DescribeSynchronizationJobsResponse describeSynchronizationJobs(DescribeSynchronizationJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status of a task that modifies synchronization objects. This is a legacy operation.</p>
     * 
     * @param request DescribeSynchronizationObjectModifyStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationObjectModifyStatusResponse
     */
    public DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatusWithOptions(DescribeSynchronizationObjectModifyStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationObjectModifyStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationObjectModifyStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status of a task that modifies synchronization objects. This is a legacy operation.</p>
     * 
     * @param request DescribeSynchronizationObjectModifyStatusRequest
     * @return DescribeSynchronizationObjectModifyStatusResponse
     */
    public DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatus(DescribeSynchronizationObjectModifyStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationObjectModifyStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all tags that are bound to a data migration, data synchronization, or change tracking instance.</p>
     * 
     * @param request DescribeTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagKeysResponse
     */
    public DescribeTagKeysResponse describeTagKeysWithOptions(DescribeTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagKeys"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all tags that are bound to a data migration, data synchronization, or change tracking instance.</p>
     * 
     * @param request DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     */
    public DescribeTagKeysResponse describeTagKeys(DescribeTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all values of a tag key that is attached to a data migration, data synchronization, or change tracking instance.</p>
     * 
     * @param request DescribeTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagValuesResponse
     */
    public DescribeTagValuesResponse describeTagValuesWithOptions(DescribeTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagValues"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagValuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all values of a tag key that is attached to a data migration, data synchronization, or change tracking instance.</p>
     * 
     * @param request DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     */
    public DescribeTagValuesResponse describeTagValues(DescribeTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a secondary role.</p>
     * 
     * @param request DetachGadInstanceDbMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachGadInstanceDbMemberResponse
     */
    public DetachGadInstanceDbMemberResponse detachGadInstanceDbMemberWithOptions(DetachGadInstanceDbMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveDbInstanceId)) {
            query.put("SlaveDbInstanceId", request.slaveDbInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachGadInstanceDbMember"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachGadInstanceDbMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a secondary role.</p>
     * 
     * @param request DetachGadInstanceDbMemberRequest
     * @return DetachGadInstanceDbMemberResponse
     */
    public DetachGadInstanceDbMemberResponse detachGadInstanceDbMember(DetachGadInstanceDbMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachGadInstanceDbMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The unit node must be an ApsaraDB RDS for MySQL instance or a self-managed MySQL database connected through Cloud Enterprise Network (CEN).</li>
     * <li>This operation initializes a built-in account named rdsdt_dtsacct in a unit node of an active geo-redundancy database cluster. DTS uses this account to connect to the node and perform synchronization tasks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initializes a built-in account in a node of an active geo-redundancy database cluster. Data Transmission Service (DTS) uses this account to connect to the node and perform synchronization tasks.</p>
     * 
     * @param request InitDtsRdsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitDtsRdsInstanceResponse
     */
    public InitDtsRdsInstanceResponse initDtsRdsInstanceWithOptions(InitDtsRdsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointCenId)) {
            query.put("EndpointCenId", request.endpointCenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointInstanceId)) {
            query.put("EndpointInstanceId", request.endpointInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointInstanceType)) {
            query.put("EndpointInstanceType", request.endpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointRegion)) {
            query.put("EndpointRegion", request.endpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitDtsRdsInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitDtsRdsInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The unit node must be an ApsaraDB RDS for MySQL instance or a self-managed MySQL database connected through Cloud Enterprise Network (CEN).</li>
     * <li>This operation initializes a built-in account named rdsdt_dtsacct in a unit node of an active geo-redundancy database cluster. DTS uses this account to connect to the node and perform synchronization tasks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initializes a built-in account in a node of an active geo-redundancy database cluster. Data Transmission Service (DTS) uses this account to connect to the node and perform synchronization tasks.</p>
     * 
     * @param request InitDtsRdsInstanceRequest
     * @return InitDtsRdsInstanceResponse
     */
    public InitDtsRdsInstanceResponse initDtsRdsInstance(InitDtsRdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initDtsRdsInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all clusters created by the current user. You can also filter specific clusters based on specified conditions.</p>
     * 
     * @param request ListDedicatedClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDedicatedClusterResponse
     */
    public ListDedicatedClusterResponse listDedicatedClusterWithOptions(ListDedicatedClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("OrderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDedicatedCluster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDedicatedClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all clusters created by the current user. You can also filter specific clusters based on specified conditions.</p>
     * 
     * @param request ListDedicatedClusterRequest
     * @return ListDedicatedClusterResponse
     */
    public ListDedicatedClusterResponse listDedicatedCluster(ListDedicatedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDedicatedClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the JobStep list</p>
     * 
     * @param request ListJobStepRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobStepResponse
     */
    public ListJobStepResponse listJobStepWithOptions(ListJobStepRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobStep"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobStepResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the JobStep list</p>
     * 
     * @param request ListJobStepRequest
     * @return ListJobStepResponse
     */
    public ListJobStepResponse listJobStep(ListJobStepRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobStepWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags bound to data migration, data synchronization, and change tracking instances. You can also query the instances bound to specific tags.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-01-01"),
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
     * <b>description</b> :
     * <p>***.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags bound to data migration, data synchronization, and change tracking instances. You can also query the instances bound to specific tags.</p>
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
     * <p>Modifies the information of a consumer group in a change tracking channel (new version).</p>
     * 
     * @param request ModifyConsumerChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyConsumerChannelResponse
     */
    public ModifyConsumerChannelResponse modifyConsumerChannelWithOptions(ModifyConsumerChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupId)) {
            query.put("ConsumerGroupId", request.consumerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupName)) {
            query.put("ConsumerGroupName", request.consumerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupPassword)) {
            query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupUserName)) {
            query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyConsumerChannelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of a consumer group in a change tracking channel (new version).</p>
     * 
     * @param request ModifyConsumerChannelRequest
     * @return ModifyConsumerChannelResponse
     */
    public ModifyConsumerChannelResponse modifyConsumerChannel(ModifyConsumerChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyConsumerChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the password of a consumer group. This is a legacy operation.</p>
     * 
     * @param request ModifyConsumerGroupPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyConsumerGroupPasswordResponse
     */
    public ModifyConsumerGroupPasswordResponse modifyConsumerGroupPasswordWithOptions(ModifyConsumerGroupPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupID)) {
            query.put("ConsumerGroupID", request.consumerGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupName)) {
            query.put("ConsumerGroupName", request.consumerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupPassword)) {
            query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupUserName)) {
            query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupNewPassword)) {
            query.put("consumerGroupNewPassword", request.consumerGroupNewPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyConsumerGroupPassword"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyConsumerGroupPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the password of a consumer group. This is a legacy operation.</p>
     * 
     * @param request ModifyConsumerGroupPasswordRequest
     * @return ModifyConsumerGroupPasswordResponse
     */
    public ModifyConsumerGroupPasswordResponse modifyConsumerGroupPassword(ModifyConsumerGroupPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyConsumerGroupPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the consumption checkpoint of a change tracking instance channel.</p>
     * 
     * @param request ModifyConsumptionTimestampRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyConsumptionTimestampResponse
     */
    public ModifyConsumptionTimestampResponse modifyConsumptionTimestampWithOptions(ModifyConsumptionTimestampRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumptionTimestamp)) {
            query.put("ConsumptionTimestamp", request.consumptionTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyConsumptionTimestamp"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyConsumptionTimestampResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the consumption checkpoint of a change tracking instance channel.</p>
     * 
     * @param request ModifyConsumptionTimestampRequest
     * @return ModifyConsumptionTimestampResponse
     */
    public ModifyConsumptionTimestampResponse modifyConsumptionTimestamp(ModifyConsumptionTimestampRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyConsumptionTimestampWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, only the overcommit ratio can be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a dedicated cluster by calling the ModifyDedicatedCluster operation.</p>
     * 
     * @param request ModifyDedicatedClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDedicatedClusterResponse
     */
    public ModifyDedicatedClusterResponse modifyDedicatedClusterWithOptions(ModifyDedicatedClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterName)) {
            query.put("DedicatedClusterName", request.dedicatedClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldRatio)) {
            query.put("OversoldRatio", request.oversoldRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedCluster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Currently, only the overcommit ratio can be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a dedicated cluster by calling the ModifyDedicatedCluster operation.</p>
     * 
     * @param request ModifyDedicatedClusterRequest
     * @return ModifyDedicatedClusterResponse
     */
    public ModifyDedicatedClusterResponse modifyDedicatedCluster(ModifyDedicatedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can preconfigure settings in the console as needed, and then preview the corresponding OpenAPI parameter information to help you specify request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies a data synchronization task by calling the ModifyDtsJob operation.</p>
     * 
     * @param tmpReq ModifyDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobResponse
     */
    public ModifyDtsJobResponse modifyDtsJobWithOptions(ModifyDtsJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyDtsJobShrinkRequest request = new ModifyDtsJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dbList)) {
            request.dbListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dbList, "DbList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataInitialization)) {
            query.put("DataInitialization", request.dataInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSynchronization)) {
            query.put("DataSynchronization", request.dataSynchronization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileOssUrl)) {
            query.put("FileOssUrl", request.fileOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureInitialization)) {
            query.put("StructureInitialization", request.structureInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbListShrink)) {
            body.put("DbList", request.dbListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.etlOperatorColumnReference)) {
            body.put("EtlOperatorColumnReference", request.etlOperatorColumnReference);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTableName)) {
            body.put("FilterTableName", request.filterTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyTypeEnum)) {
            body.put("ModifyTypeEnum", request.modifyTypeEnum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserved)) {
            body.put("Reserved", request.reserved);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can preconfigure settings in the console as needed, and then preview the corresponding OpenAPI parameter information to help you specify request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies a data synchronization task by calling the ModifyDtsJob operation.</p>
     * 
     * @param request ModifyDtsJobRequest
     * @return ModifyDtsJobResponse
     */
    public ModifyDtsJobResponse modifyDtsJob(ModifyDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobWithOptions(request, runtime);
    }

    public ModifyDtsJobResponse modifyDtsJobAdvance(ModifyDtsJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
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
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "Dts"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        ModifyDtsJobRequest modifyDtsJobReq = new ModifyDtsJobRequest();
        com.aliyun.openapiutil.Client.convert(request, modifyDtsJobReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileOssUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileOssUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            modifyDtsJobReq.fileOssUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        ModifyDtsJobResponse modifyDtsJobResp = this.modifyDtsJobWithOptions(modifyDtsJobReq, runtime);
        return modifyDtsJobResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the parameters of a DTS task by calling the ModifyDtsJobConfig operation.</p>
     * 
     * @param request ModifyDtsJobConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobConfigResponse
     */
    public ModifyDtsJobConfigResponse modifyDtsJobConfigWithOptions(ModifyDtsJobConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the parameters of a DTS task by calling the ModifyDtsJobConfig operation.</p>
     * 
     * @param request ModifyDtsJobConfigRequest
     * @return ModifyDtsJobConfigResponse
     */
    public ModifyDtsJobConfigResponse modifyDtsJobConfig(ModifyDtsJobConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After a migration task is changed from a dedicated cluster to a public cluster, the billing method of the task changes to pay-as-you-go, and billing starts.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Changes the dedicated cluster on which a task runs.</p>
     * 
     * @param request ModifyDtsJobDedicatedClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobDedicatedClusterResponse
     */
    public ModifyDtsJobDedicatedClusterResponse modifyDtsJobDedicatedClusterWithOptions(ModifyDtsJobDedicatedClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobIds)) {
            query.put("DtsJobIds", request.dtsJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobDedicatedCluster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobDedicatedClusterResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After a migration task is changed from a dedicated cluster to a public cluster, the billing method of the task changes to pay-as-you-go, and billing starts.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Changes the dedicated cluster on which a task runs.</p>
     * 
     * @param request ModifyDtsJobDedicatedClusterRequest
     * @return ModifyDtsJobDedicatedClusterResponse
     */
    public ModifyDtsJobDedicatedClusterResponse modifyDtsJobDedicatedCluster(ModifyDtsJobDedicatedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobDedicatedClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>DTS instances in a dedicated cluster must support specification changes. By changing the resources consumed by a task at runtime, you can dynamically adjust the number of schedulable tasks in the current cluster, thereby deducting or releasing the total number of DUs in the cluster.</li>
     * <li>Before modifying the DU upper limit of a task, ensure that sufficient resources are available.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the DU upper limit of a DTS task by calling the ModifyDtsJobDuLimit operation.</p>
     * 
     * @param request ModifyDtsJobDuLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobDuLimitResponse
     */
    public ModifyDtsJobDuLimitResponse modifyDtsJobDuLimitWithOptions(ModifyDtsJobDuLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duLimit)) {
            query.put("DuLimit", request.duLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobDuLimit"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobDuLimitResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>DTS instances in a dedicated cluster must support specification changes. By changing the resources consumed by a task at runtime, you can dynamically adjust the number of schedulable tasks in the current cluster, thereby deducting or releasing the total number of DUs in the cluster.</li>
     * <li>Before modifying the DU upper limit of a task, ensure that sufficient resources are available.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the DU upper limit of a DTS task by calling the ModifyDtsJobDuLimit operation.</p>
     * 
     * @param request ModifyDtsJobDuLimitRequest
     * @return ModifyDtsJobDuLimitResponse
     */
    public ModifyDtsJobDuLimitResponse modifyDtsJobDuLimit(ModifyDtsJobDuLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobDuLimitWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the database instance is modified, the DTS incremental write module rolls back writes by 10 seconds. If the synchronized or migrated data does not have a primary key, stop writing data to the source instance during the database instance replacement. Otherwise, duplicate data may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the source or destination instance of a DTS synchronization or migration task.</p>
     * 
     * @param request ModifyDtsJobEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobEndpointResponse
     */
    public ModifyDtsJobEndpointResponse modifyDtsJobEndpointWithOptions(ModifyDtsJobEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointInstanceId)) {
            query.put("EndpointInstanceId", request.endpointInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointInstanceType)) {
            query.put("EndpointInstanceType", request.endpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointIp)) {
            query.put("EndpointIp", request.endpointIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointPort)) {
            query.put("EndpointPort", request.endpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointRegionId)) {
            query.put("EndpointRegionId", request.endpointRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyAccount)) {
            query.put("ModifyAccount", request.modifyAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardPassword)) {
            query.put("ShardPassword", request.shardPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardUsername)) {
            query.put("ShardUsername", request.shardUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobEndpoint"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobEndpointResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the database instance is modified, the DTS incremental write module rolls back writes by 10 seconds. If the synchronized or migrated data does not have a primary key, stop writing data to the source instance during the database instance replacement. Otherwise, duplicate data may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the source or destination instance of a DTS synchronization or migration task.</p>
     * 
     * @param request ModifyDtsJobEndpointRequest
     * @return ModifyDtsJobEndpointResponse
     */
    public ModifyDtsJobEndpointResponse modifyDtsJobEndpoint(ModifyDtsJobEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a DTS task by calling ModifyDtsJobName.</p>
     * 
     * @param request ModifyDtsJobNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobNameResponse
     */
    public ModifyDtsJobNameResponse modifyDtsJobNameWithOptions(ModifyDtsJobNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobName)) {
            query.put("DtsJobName", request.dtsJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobName"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a DTS task by calling ModifyDtsJobName.</p>
     * 
     * @param request ModifyDtsJobNameRequest
     * @return ModifyDtsJobNameResponse
     */
    public ModifyDtsJobNameResponse modifyDtsJobName(ModifyDtsJobNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the password of a DTS task (new version).</p>
     * 
     * @param request ModifyDtsJobPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobPasswordResponse
     */
    public ModifyDtsJobPasswordResponse modifyDtsJobPasswordWithOptions(ModifyDtsJobPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobPassword"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the password of a DTS task (new version).</p>
     * 
     * @param request ModifyDtsJobPasswordRequest
     * @return ModifyDtsJobPasswordResponse
     */
    public ModifyDtsJobPasswordResponse modifyDtsJobPassword(ModifyDtsJobPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adjusts the migration rate of a data synchronization or migration instance.</p>
     * 
     * @param request ModifyDynamicConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDynamicConfigResponse
     */
    public ModifyDynamicConfigResponse modifyDynamicConfigWithOptions(ModifyDynamicConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configList)) {
            query.put("ConfigList", request.configList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableLimit)) {
            query.put("EnableLimit", request.enableLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobCode)) {
            query.put("JobCode", request.jobCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDynamicConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDynamicConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adjusts the migration rate of a data synchronization or migration instance.</p>
     * 
     * @param request ModifyDynamicConfigRequest
     * @return ModifyDynamicConfigResponse
     */
    public ModifyDynamicConfigResponse modifyDynamicConfig(ModifyDynamicConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDynamicConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a Global Active Database (GAD) instance.</p>
     * 
     * @param request ModifyGadInstanceNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGadInstanceNameResponse
     */
    public ModifyGadInstanceNameResponse modifyGadInstanceNameWithOptions(ModifyGadInstanceNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGadInstanceName"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGadInstanceNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a Global Active Database (GAD) instance.</p>
     * 
     * @param request ModifyGadInstanceNameRequest
     * @return ModifyGadInstanceNameResponse
     */
    public ModifyGadInstanceNameResponse modifyGadInstanceName(ModifyGadInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGadInstanceNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the offset for incremental data writing.</p>
     * 
     * @param request ModifyJobStepCheckpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyJobStepCheckpointResponse
     */
    public ModifyJobStepCheckpointResponse modifyJobStepCheckpointWithOptions(ModifyJobStepCheckpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobStepId)) {
            query.put("JobStepId", request.jobStepId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newCheckPoint)) {
            query.put("NewCheckPoint", request.newCheckPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyJobStepCheckpoint"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyJobStepCheckpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the offset for incremental data writing.</p>
     * 
     * @param request ModifyJobStepCheckpointRequest
     * @return ModifyJobStepCheckpointResponse
     */
    public ModifyJobStepCheckpointResponse modifyJobStepCheckpoint(ModifyJobStepCheckpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyJobStepCheckpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can perform the required preconfigurations in the console and then preview the corresponding OpenAPI parameter information to help you fill in the request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies a change tracking task (new version).</p>
     * 
     * @param request ModifySubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySubscriptionResponse
     */
    public ModifySubscriptionResponse modifySubscriptionWithOptions(ModifySubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbList)) {
            query.put("DbList", request.dbList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            query.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserved)) {
            query.put("Reserved", request.reserved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDataTypeDDL)) {
            query.put("SubscriptionDataTypeDDL", request.subscriptionDataTypeDDL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDataTypeDML)) {
            query.put("SubscriptionDataTypeDML", request.subscriptionDataTypeDML);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySubscription"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySubscriptionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can perform the required preconfigurations in the console and then preview the corresponding OpenAPI parameter information to help you fill in the request parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2851612.html">Preview OpenAPI request parameters</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies a change tracking task (new version).</p>
     * 
     * @param request ModifySubscriptionRequest
     * @return ModifySubscriptionResponse
     */
    public ModifySubscriptionResponse modifySubscription(ModifySubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySubscriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the subscription objects of a change tracking task. This is a legacy operation.</p>
     * 
     * @param request ModifySubscriptionObjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySubscriptionObjectResponse
     */
    public ModifySubscriptionObjectResponse modifySubscriptionObjectWithOptions(ModifySubscriptionObjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionObject)) {
            query.put("SubscriptionObject", request.subscriptionObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySubscriptionObject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySubscriptionObjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the subscription objects of a change tracking task. This is a legacy operation.</p>
     * 
     * @param request ModifySubscriptionObjectRequest
     * @return ModifySubscriptionObjectResponse
     */
    public ModifySubscriptionObjectResponse modifySubscriptionObject(ModifySubscriptionObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySubscriptionObjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the synchronization objects in a data synchronization job instance. This is a legacy operation.</p>
     * 
     * @param request ModifySynchronizationObjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySynchronizationObjectResponse
     */
    public ModifySynchronizationObjectResponse modifySynchronizationObjectWithOptions(ModifySynchronizationObjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationObjects)) {
            body.put("SynchronizationObjects", request.synchronizationObjects);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySynchronizationObject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySynchronizationObjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the synchronization objects in a data synchronization job instance. This is a legacy operation.</p>
     * 
     * @param request ModifySynchronizationObjectRequest
     * @return ModifySynchronizationObjectResponse
     */
    public ModifySynchronizationObjectResponse modifySynchronizationObject(ModifySynchronizationObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySynchronizationObjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Prechecks an order for creating a Global Active Database (GAD) instance group.</p>
     * 
     * @param request PreCheckCreateGadOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreCheckCreateGadOrderResponse
     */
    public PreCheckCreateGadOrderResponse preCheckCreateGadOrderWithOptions(PreCheckCreateGadOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterDatabaseName)) {
            query.put("MasterDatabaseName", request.masterDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterEngineArchType)) {
            query.put("MasterEngineArchType", request.masterEngineArchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterShardAccountName)) {
            query.put("MasterShardAccountName", request.masterShardAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterShardAccountPassword)) {
            query.put("MasterShardAccountPassword", request.masterShardAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveDatabaseName)) {
            query.put("SlaveDatabaseName", request.slaveDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveDbInstanceId)) {
            query.put("SlaveDbInstanceId", request.slaveDbInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveDbInstanceRegion)) {
            query.put("SlaveDbInstanceRegion", request.slaveDbInstanceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveEngineArchType)) {
            query.put("SlaveEngineArchType", request.slaveEngineArchType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreCheckCreateGadOrder"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreCheckCreateGadOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Prechecks an order for creating a Global Active Database (GAD) instance group.</p>
     * 
     * @param request PreCheckCreateGadOrderRequest
     * @return PreCheckCreateGadOrderResponse
     */
    public PreCheckCreateGadOrderResponse preCheckCreateGadOrder(PreCheckCreateGadOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preCheckCreateGadOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Promote a geo-disaster recovery instance from the secondary role to the primary role</p>
     * 
     * @param request PromoteToMasterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PromoteToMasterResponse
     */
    public PromoteToMasterResponse promoteToMasterWithOptions(PromoteToMasterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterDbInstanceId)) {
            query.put("MasterDbInstanceId", request.masterDbInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveDbInstanceId)) {
            query.put("SlaveDbInstanceId", request.slaveDbInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PromoteToMaster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PromoteToMasterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Promote a geo-disaster recovery instance from the secondary role to the primary role</p>
     * 
     * @param request PromoteToMasterRequest
     * @return PromoteToMasterResponse
     */
    public PromoteToMasterResponse promoteToMaster(PromoteToMasterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.promoteToMasterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a DTS instance. This operation is applicable only to subscription DTS instances.</p>
     * 
     * @param request RenewInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyCount)) {
            query.put("BuyCount", request.buyCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a DTS instance. This operation is applicable only to subscription DTS instances.</p>
     * 
     * @param request RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the configuration of a data synchronization or change tracking task is cleared, the original task is deleted. DTS creates a new unconfigured task. You must call the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to reconfigure the task.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets a data synchronization or change tracking task.</p>
     * 
     * @param request ResetDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetDtsJobResponse
     */
    public ResetDtsJobResponse resetDtsJobWithOptions(ResetDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDtsJobResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the configuration of a data synchronization or change tracking task is cleared, the original task is deleted. DTS creates a new unconfigured task. You must call the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to reconfigure the task.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets a data synchronization or change tracking task.</p>
     * 
     * @param request ResetDtsJobRequest
     * @return ResetDtsJobResponse
     */
    public ResetDtsJobResponse resetDtsJob(ResetDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDtsJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you reset the configuration of a data synchronization task, the original synchronization task is released. You must call the <strong>ConfigureSynchronizationJob</strong> operation to reconfigure the synchronization task before you can start the task.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets the configuration of a data synchronization task.</p>
     * 
     * @param request ResetSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetSynchronizationJobResponse
     */
    public ResetSynchronizationJobResponse resetSynchronizationJobWithOptions(ResetSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSynchronizationJobResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you reset the configuration of a data synchronization task, the original synchronization task is released. You must call the <strong>ConfigureSynchronizationJob</strong> operation to reconfigure the synchronization task before you can start the task.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets the configuration of a data synchronization task.</p>
     * 
     * @param request ResetSynchronizationJobRequest
     * @return ResetSynchronizationJobResponse
     */
    public ResetSynchronizationJobResponse resetSynchronizationJob(ResetSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调转双向任务的方向</p>
     * 
     * @param request ReverseTwoWayDirectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReverseTwoWayDirectionResponse
     */
    public ReverseTwoWayDirectionResponse reverseTwoWayDirectionWithOptions(ReverseTwoWayDirectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreErrorSubJob)) {
            query.put("IgnoreErrorSubJob", request.ignoreErrorSubJob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReverseTwoWayDirection"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReverseTwoWayDirectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调转双向任务的方向</p>
     * 
     * @param request ReverseTwoWayDirectionRequest
     * @return ReverseTwoWayDirectionResponse
     */
    public ReverseTwoWayDirectionResponse reverseTwoWayDirection(ReverseTwoWayDirectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reverseTwoWayDirectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Skips the precheck for a legacy data migration or synchronization task.</p>
     * 
     * @param request ShieldPrecheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ShieldPrecheckResponse
     */
    public ShieldPrecheckResponse shieldPrecheckWithOptions(ShieldPrecheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.precheckItems)) {
            query.put("PrecheckItems", request.precheckItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ShieldPrecheck"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ShieldPrecheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Skips the precheck for a legacy data migration or synchronization task.</p>
     * 
     * @param request ShieldPrecheckRequest
     * @return ShieldPrecheckResponse
     */
    public ShieldPrecheckResponse shieldPrecheck(ShieldPrecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.shieldPrecheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Skips tables that do not need to be synchronized during the full data synchronization phase.</p>
     * 
     * @param request SkipFullJobTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SkipFullJobTableResponse
     */
    public SkipFullJobTableResponse skipFullJobTableWithOptions(SkipFullJobTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobProgressId)) {
            query.put("JobProgressId", request.jobProgressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipFullJobTable"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipFullJobTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Skips tables that do not need to be synchronized during the full data synchronization phase.</p>
     * 
     * @param request SkipFullJobTableRequest
     * @return SkipFullJobTableResponse
     */
    public SkipFullJobTableResponse skipFullJobTable(SkipFullJobTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.skipFullJobTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Suppresses or unsuppresses precheck alert items.</p>
     * 
     * @param request SkipPreCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SkipPreCheckResponse
     */
    public SkipPreCheckResponse skipPreCheckWithOptions(SkipPreCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipPreCheckItems)) {
            query.put("SkipPreCheckItems", request.skipPreCheckItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipPreCheckNames)) {
            query.put("SkipPreCheckNames", request.skipPreCheckNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipPreCheck"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipPreCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Suppresses or unsuppresses precheck alert items.</p>
     * 
     * @param request SkipPreCheckRequest
     * @return SkipPreCheckResponse
     */
    public SkipPreCheckResponse skipPreCheck(SkipPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.skipPreCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data migration, data synchronization, or change tracking task by calling the StartDtsJob operation.</p>
     * 
     * @param request StartDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDtsJobResponse
     */
    public StartDtsJobResponse startDtsJobWithOptions(StartDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDtsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data migration, data synchronization, or change tracking task by calling the StartDtsJob operation.</p>
     * 
     * @param request StartDtsJobRequest
     * @return StartDtsJobResponse
     */
    public StartDtsJobResponse startDtsJob(StartDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDtsJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts multiple data migration or synchronization tasks in a batch by calling the StartDtsJobs operation.</p>
     * 
     * @param request StartDtsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDtsJobsResponse
     */
    public StartDtsJobsResponse startDtsJobsWithOptions(StartDtsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobIds)) {
            query.put("DtsJobIds", request.dtsJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDtsJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts multiple data migration or synchronization tasks in a batch by calling the StartDtsJobs operation.</p>
     * 
     * @param request StartDtsJobsRequest
     * @return StartDtsJobsResponse
     */
    public StartDtsJobsResponse startDtsJobs(StartDtsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDtsJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data migration task of Data Transmission Service (DTS).</p>
     * 
     * @param request StartMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartMigrationJobResponse
     */
    public StartMigrationJobResponse startMigrationJobWithOptions(StartMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartMigrationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data migration task of Data Transmission Service (DTS).</p>
     * 
     * @param request StartMigrationJobRequest
     * @return StartMigrationJobResponse
     */
    public StartMigrationJobResponse startMigrationJob(StartMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMigrationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, check the status of the reverse task in the console or by calling <a href="https://help.aliyun.com/document_detail/208925.html">DescribeDtsJobDetail</a>. Make sure that the task has not been released and is in the paused state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a reverse task that is created by calling the CreateReverseDtsJob operation.</p>
     * 
     * @param request StartReverseWriterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartReverseWriterResponse
     */
    public StartReverseWriterResponse startReverseWriterWithOptions(StartReverseWriterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkPoint)) {
            query.put("CheckPoint", request.checkPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartReverseWriter"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartReverseWriterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, check the status of the reverse task in the console or by calling <a href="https://help.aliyun.com/document_detail/208925.html">DescribeDtsJobDetail</a>. Make sure that the task has not been released and is in the paused state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a reverse task that is created by calling the CreateReverseDtsJob operation.</p>
     * 
     * @param request StartReverseWriterRequest
     * @return StartReverseWriterResponse
     */
    public StartReverseWriterResponse startReverseWriter(StartReverseWriterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startReverseWriterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts the channel of a change tracking instance. This is a legacy operation.</p>
     * 
     * @param request StartSubscriptionInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSubscriptionInstanceResponse
     */
    public StartSubscriptionInstanceResponse startSubscriptionInstanceWithOptions(StartSubscriptionInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSubscriptionInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts the channel of a change tracking instance. This is a legacy operation.</p>
     * 
     * @param request StartSubscriptionInstanceRequest
     * @return StartSubscriptionInstanceResponse
     */
    public StartSubscriptionInstanceResponse startSubscriptionInstance(StartSubscriptionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSubscriptionInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data synchronization task.</p>
     * 
     * @param request StartSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSynchronizationJobResponse
     */
    public StartSynchronizationJobResponse startSynchronizationJobWithOptions(StartSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSynchronizationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data synchronization task.</p>
     * 
     * @param request StartSynchronizationJobRequest
     * @return StartSynchronizationJobResponse
     */
    public StartSynchronizationJobResponse startSynchronizationJob(StartSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a cluster by calling the StopDedicatedCluster operation.</p>
     * 
     * @param request StopDedicatedClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDedicatedClusterResponse
     */
    public StopDedicatedClusterResponse stopDedicatedClusterWithOptions(StopDedicatedClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterName)) {
            query.put("DedicatedClusterName", request.dedicatedClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDedicatedCluster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDedicatedClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a cluster by calling the StopDedicatedCluster operation.</p>
     * 
     * @param request StopDedicatedClusterRequest
     * @return StopDedicatedClusterResponse
     */
    public StopDedicatedClusterResponse stopDedicatedCluster(StopDedicatedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDedicatedClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a data migration, data synchronization, or change tracking task by calling StopDtsJob.</p>
     * 
     * @param request StopDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDtsJobResponse
     */
    public StopDtsJobResponse stopDtsJobWithOptions(StopDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDtsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a data migration, data synchronization, or change tracking task by calling StopDtsJob.</p>
     * 
     * @param request StopDtsJobRequest
     * @return StopDtsJobResponse
     */
    public StopDtsJobResponse stopDtsJob(StopDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDtsJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops multiple DTS tasks at a time.</p>
     * 
     * @param request StopDtsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDtsJobsResponse
     */
    public StopDtsJobsResponse stopDtsJobsWithOptions(StopDtsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobIds)) {
            query.put("DtsJobIds", request.dtsJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDtsJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops multiple DTS tasks at a time.</p>
     * 
     * @param request StopDtsJobsRequest
     * @return StopDtsJobsResponse
     */
    public StopDtsJobsResponse stopDtsJobs(StopDtsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDtsJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Ends a data migration task that is in a migration state.</p>
     * 
     * @param request StopMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopMigrationJobResponse
     */
    public StopMigrationJobResponse stopMigrationJobWithOptions(StopMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMigrationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Ends a data migration task that is in a migration state.</p>
     * 
     * @param request StopMigrationJobRequest
     * @return StopMigrationJobResponse
     */
    public StopMigrationJobResponse stopMigrationJob(StopMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopMigrationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of tables migrated in a Data Transmission Service (DTS) data migration or synchronization task.</p>
     * 
     * @param request SummaryJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SummaryJobDetailResponse
     */
    public SummaryJobDetailResponse summaryJobDetailWithOptions(SummaryJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobCode)) {
            query.put("JobCode", request.jobCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structType)) {
            query.put("StructType", request.structType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SummaryJobDetail"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SummaryJobDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of tables migrated in a Data Transmission Service (DTS) data migration or synchronization task.</p>
     * 
     * @param request SummaryJobDetailRequest
     * @return SummaryJobDetailResponse
     */
    public SummaryJobDetailResponse summaryJobDetail(SummaryJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.summaryJobDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Suspends a data migration or synchronization task. Change tracking tasks are not supported. Change tracking instances do not support the suspend capability. Do not call this operation on change tracking instances.</p>
     * 
     * @param request SuspendDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendDtsJobResponse
     */
    public SuspendDtsJobResponse suspendDtsJobWithOptions(SuspendDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendDtsJobResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Suspends a data migration or synchronization task. Change tracking tasks are not supported. Change tracking instances do not support the suspend capability. Do not call this operation on change tracking instances.</p>
     * 
     * @param request SuspendDtsJobRequest
     * @return SuspendDtsJobResponse
     */
    public SuspendDtsJobResponse suspendDtsJob(SuspendDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendDtsJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends multiple DTS tasks at a time.</p>
     * 
     * @param request SuspendDtsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendDtsJobsResponse
     */
    public SuspendDtsJobsResponse suspendDtsJobsWithOptions(SuspendDtsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobIds)) {
            query.put("DtsJobIds", request.dtsJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendDtsJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends multiple DTS tasks at a time.</p>
     * 
     * @param request SuspendDtsJobsRequest
     * @return SuspendDtsJobsResponse
     */
    public SuspendDtsJobsResponse suspendDtsJobs(SuspendDtsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendDtsJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends a data migration task that is in progress.</p>
     * 
     * @param request SuspendMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendMigrationJobResponse
     */
    public SuspendMigrationJobResponse suspendMigrationJobWithOptions(SuspendMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendMigrationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends a data migration task that is in progress.</p>
     * 
     * @param request SuspendMigrationJobRequest
     * @return SuspendMigrationJobResponse
     */
    public SuspendMigrationJobResponse suspendMigrationJob(SuspendMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendMigrationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>When you call this operation, the synchronization task must be in the Synchronizing state.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>A synchronization task cannot be paused for more than 6 hours. Otherwise, the task cannot be restarted.</li>
     * <li>DTS continues to charge fees for a pay-as-you-go synchronization task even if the task is paused. This is because DTS only pauses writing data to the destination instance but continues to pull logs from the source instance to ensure quick resumption when the task is restarted. Therefore, the task still consumes resources such as bandwidth of the source database.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pauses a data synchronization task that is in the Synchronizing state.</p>
     * 
     * @param request SuspendSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendSynchronizationJobResponse
     */
    public SuspendSynchronizationJobResponse suspendSynchronizationJobWithOptions(SuspendSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendSynchronizationJobResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>When you call this operation, the synchronization task must be in the Synchronizing state.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>A synchronization task cannot be paused for more than 6 hours. Otherwise, the task cannot be restarted.</li>
     * <li>DTS continues to charge fees for a pay-as-you-go synchronization task even if the task is paused. This is because DTS only pauses writing data to the destination instance but continues to pull logs from the source instance to ensure quick resumption when the task is restarted. Therefore, the task still consumes resources such as bandwidth of the source database.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pauses a data synchronization task that is in the Synchronizing state.</p>
     * 
     * @param request SuspendSynchronizationJobRequest
     * @return SuspendSynchronizationJobResponse
     */
    public SuspendSynchronizationJobResponse suspendSynchronizationJob(SuspendSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs physical migration of an MSSQL database to Alibaba Cloud.</p>
     * 
     * @param request SwitchPhysicalDtsJobToCloudRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchPhysicalDtsJobToCloudResponse
     */
    public SwitchPhysicalDtsJobToCloudResponse switchPhysicalDtsJobToCloudWithOptions(SwitchPhysicalDtsJobToCloudRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchPhysicalDtsJobToCloud"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchPhysicalDtsJobToCloudResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs physical migration of an MSSQL database to Alibaba Cloud.</p>
     * 
     * @param request SwitchPhysicalDtsJobToCloudRequest
     * @return SwitchPhysicalDtsJobToCloudResponse
     */
    public SwitchPhysicalDtsJobToCloudResponse switchPhysicalDtsJobToCloud(SwitchPhysicalDtsJobToCloudRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchPhysicalDtsJobToCloudWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Passes the connection information of the new database to DTS after a primary/secondary switchover. DTS restarts data synchronization from the checkpoint.</p>
     * 
     * @param request SwitchSynchronizationEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchSynchronizationEndpointResponse
     */
    public SwitchSynchronizationEndpointResponse switchSynchronizationEndpointWithOptions(SwitchSynchronizationEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchSynchronizationEndpoint"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchSynchronizationEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Passes the connection information of the new database to DTS after a primary/secondary switchover. DTS restarts data synchronization from the checkpoint.</p>
     * 
     * @param request SwitchSynchronizationEndpointRequest
     * @return SwitchSynchronizationEndpointResponse
     */
    public SwitchSynchronizationEndpointResponse switchSynchronizationEndpoint(SwitchSynchronizationEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchSynchronizationEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you have a large number of instances, you can create multiple tags and attach different tags to instances for categorization. Then, you can filter instances by tag.</p>
     * <ul>
     * <li>A tag consists of a key-value pair. Tag keys must be unique within the same Alibaba Cloud account and region. Tag values do not have this restriction.</li>
     * <li>If the specified tag does not exist, the tag is automatically created and attached to the destination instance.</li>
     * <li>If the instance already has a tag with the same key, the existing tag is overwritten.</li>
     * <li>You can attach up to 20 tags to each instance.</li>
     * <li>You can invoke the operation to attach tags to up to 50 instances at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds tags to one or more data migration, synchronization, and change tracking instances by calling the TagResources operation.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you have a large number of instances, you can create multiple tags and attach different tags to instances for categorization. Then, you can filter instances by tag.</p>
     * <ul>
     * <li>A tag consists of a key-value pair. Tag keys must be unique within the same Alibaba Cloud account and region. Tag values do not have this restriction.</li>
     * <li>If the specified tag does not exist, the tag is automatically created and attached to the destination instance.</li>
     * <li>If the instance already has a tag with the same key, the existing tag is overwritten.</li>
     * <li>You can attach up to 20 tags to each instance.</li>
     * <li>You can invoke the operation to attach tags to up to 50 instances at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds tags to one or more data migration, synchronization, and change tracking instances by calling the TagResources operation.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Downgrading DTS instance specifications is no longer supported.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the source of a DTS instance is Redis 6.0 and incremental data updates exist, do not perform an upgrade. Otherwise, the DTS instance may fail and cannot be recovered. You must reconfigure the instance after a failure.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades or downgrades the specifications of a DTS instance.</p>
     * 
     * @param request TransferInstanceClassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferInstanceClassResponse
     */
    public TransferInstanceClassResponse transferInstanceClassWithOptions(TransferInstanceClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseCount)) {
            query.put("DatabaseCount", request.databaseCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferInstanceClass"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferInstanceClassResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Downgrading DTS instance specifications is no longer supported.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the source of a DTS instance is Redis 6.0 and incremental data updates exist, do not perform an upgrade. Otherwise, the DTS instance may fail and cannot be recovered. You must reconfigure the instance after a failure.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades or downgrades the specifications of a DTS instance.</p>
     * 
     * @param request TransferInstanceClassRequest
     * @return TransferInstanceClassResponse
     */
    public TransferInstanceClassResponse transferInstanceClass(TransferInstanceClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferInstanceClassWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of Data Transmission Service (DTS).
     * &lt;props=&quot;intl&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/data-transmission-service/pricing">pricing</a> of Data Transmission Service (DTS).</p>
     * <ul>
     * <li>To avoid resource waste, confirm the payment method transformation before you perform the operation.</li>
     * <li>Data migration instances support only the pay-as-you-go billing method. No transformation is required.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>Serverless instances do not support payment method transformation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Transforms the payment method of a DTS instance.</p>
     * 
     * @param request TransferPayTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferPayTypeResponse
     */
    public TransferPayTypeResponse transferPayTypeWithOptions(TransferPayTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyCount)) {
            query.put("BuyCount", request.buyCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDu)) {
            query.put("MaxDu", request.maxDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDu)) {
            query.put("MinDu", request.minDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferPayType"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferPayTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of Data Transmission Service (DTS).
     * &lt;props=&quot;intl&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/data-transmission-service/pricing">pricing</a> of Data Transmission Service (DTS).</p>
     * <ul>
     * <li>To avoid resource waste, confirm the payment method transformation before you perform the operation.</li>
     * <li>Data migration instances support only the pay-as-you-go billing method. No transformation is required.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>Serverless instances do not support payment method transformation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Transforms the payment method of a DTS instance.</p>
     * 
     * @param request TransferPayTypeRequest
     * @return TransferPayTypeResponse
     */
    public TransferPayTypeResponse transferPayType(TransferPayTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferPayTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After a tag is unbound from an instance, the tag is automatically deleted if it is not bound to any other instance.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Unbinds tags from data migration, synchronization, and change tracking instances.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-01-01"),
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
     * <b>description</b> :
     * <blockquote>
     * <p>After a tag is unbound from an instance, the tag is automatically deleted if it is not bound to any other instance.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Unbinds tags from data migration, synchronization, and change tracking instances.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of ApsaraDB DTS.
     * &lt;props=&quot;intl&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/data-transmission-service/pricing">pricing</a> of ApsaraDB DTS.
     * Before you begin:</p>
     * <ul>
     * <li>The database type of both the source instance and the destination instance of the data synchronization node must be <strong>MySQL</strong>.</li>
     * <li>The synchronization topology of the data synchronization node must be <strong>one-way synchronization</strong>.</li>
     * <li>The data synchronization node must be in the <strong>Synchronizing</strong> state.</li>
     * <li>During the upgrade, data synchronization may experience a latency of approximately 5 seconds. Perform this operation during off-peak hours.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the synchronization topology of a DTS data synchronization instance from one-way synchronization to two-way synchronization.</p>
     * 
     * @param request UpgradeTwoWayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeTwoWayResponse
     */
    public UpgradeTwoWayResponse upgradeTwoWayWithOptions(UpgradeTwoWayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeTwoWay"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeTwoWayResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/dts/detail">pricing</a> of ApsaraDB DTS.
     * &lt;props=&quot;intl&quot;&gt;Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/data-transmission-service/pricing">pricing</a> of ApsaraDB DTS.
     * Before you begin:</p>
     * <ul>
     * <li>The database type of both the source instance and the destination instance of the data synchronization node must be <strong>MySQL</strong>.</li>
     * <li>The synchronization topology of the data synchronization node must be <strong>one-way synchronization</strong>.</li>
     * <li>The data synchronization node must be in the <strong>Synchronizing</strong> state.</li>
     * <li>During the upgrade, data synchronization may experience a latency of approximately 5 seconds. Perform this operation during off-peak hours.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the synchronization topology of a DTS data synchronization instance from one-way synchronization to two-way synchronization.</p>
     * 
     * @param request UpgradeTwoWayRequest
     * @return UpgradeTwoWayResponse
     */
    public UpgradeTwoWayResponse upgradeTwoWay(UpgradeTwoWayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeTwoWayWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;If the <strong>source or destination instance</strong> is a <strong>self-managed database</strong> or a <strong>third-party ApsaraDB database</strong>, you need to invoke this operation to query the IP addresses of DTS servers, and then add the returned IP addresses to the security settings (typically the firewall) of the source or destination instance. For more information about how to add IP addresses, see <a href="https://help.aliyun.com/document_detail/84900.html">Add the CIDR blocks of DTS servers to the whitelist of a self-managed database for migration, synchronization, or subscribe</a>.
     * &lt;props=&quot;intl&quot;&gt;If the <strong>source or destination instance</strong> is a <strong>self-managed database</strong> or a <strong>third-party ApsaraDB database</strong>, you need to invoke this operation to query the IP addresses of DTS servers, and then add the returned IP addresses to the security settings (typically the firewall) of the source or destination instance. For more information about how to add IP addresses, see <a href="https://help.aliyun.com/document_detail/176627.html">Add the CIDR blocks of DTS servers to the whitelist of a self-managed database</a>.</p>
     * <blockquote>
     * <p>If the <strong>source or destination database</strong> is an <strong>Alibaba Cloud database instance</strong> (such as ApsaraDB RDS or ApsaraDB for MongoDB) or a <strong>self-managed database hosted on ECS</strong>, the system automatically adds the IP addresses of DTS servers to the security settings of the instance when you click <strong>Authorize Whitelist and Proceed to Next Step</strong> during the configuration of the source or destination instance. You do not need to manually add the IP addresses.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP addresses of DTS servers by calling the WhiteIpList operation.</p>
     * 
     * @param request WhiteIpListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WhiteIpListResponse
     */
    public WhiteIpListResponse whiteIpListWithOptions(WhiteIpListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destAliyunUid)) {
            query.put("DestAliyunUid", request.destAliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPrimaryVswId)) {
            query.put("DestPrimaryVswId", request.destPrimaryVswId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destRoleName)) {
            query.put("DestRoleName", request.destRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destSecondaryVswId)) {
            query.put("DestSecondaryVswId", request.destSecondaryVswId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destVpcId)) {
            query.put("DestVpcId", request.destVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegion)) {
            query.put("DestinationRegion", request.destinationRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcAliyunUid)) {
            query.put("SrcAliyunUid", request.srcAliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPrimaryVswId)) {
            query.put("SrcPrimaryVswId", request.srcPrimaryVswId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcRoleName)) {
            query.put("SrcRoleName", request.srcRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcSecondaryVswId)) {
            query.put("SrcSecondaryVswId", request.srcSecondaryVswId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcVpcId)) {
            query.put("SrcVpcId", request.srcVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WhiteIpList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WhiteIpListResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;If the <strong>source or destination instance</strong> is a <strong>self-managed database</strong> or a <strong>third-party ApsaraDB database</strong>, you need to invoke this operation to query the IP addresses of DTS servers, and then add the returned IP addresses to the security settings (typically the firewall) of the source or destination instance. For more information about how to add IP addresses, see <a href="https://help.aliyun.com/document_detail/84900.html">Add the CIDR blocks of DTS servers to the whitelist of a self-managed database for migration, synchronization, or subscribe</a>.
     * &lt;props=&quot;intl&quot;&gt;If the <strong>source or destination instance</strong> is a <strong>self-managed database</strong> or a <strong>third-party ApsaraDB database</strong>, you need to invoke this operation to query the IP addresses of DTS servers, and then add the returned IP addresses to the security settings (typically the firewall) of the source or destination instance. For more information about how to add IP addresses, see <a href="https://help.aliyun.com/document_detail/176627.html">Add the CIDR blocks of DTS servers to the whitelist of a self-managed database</a>.</p>
     * <blockquote>
     * <p>If the <strong>source or destination database</strong> is an <strong>Alibaba Cloud database instance</strong> (such as ApsaraDB RDS or ApsaraDB for MongoDB) or a <strong>self-managed database hosted on ECS</strong>, the system automatically adds the IP addresses of DTS servers to the security settings of the instance when you click <strong>Authorize Whitelist and Proceed to Next Step</strong> during the configuration of the source or destination instance. You do not need to manually add the IP addresses.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP addresses of DTS servers by calling the WhiteIpList operation.</p>
     * 
     * @param request WhiteIpListRequest
     * @return WhiteIpListResponse
     */
    public WhiteIpListResponse whiteIpList(WhiteIpListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.whiteIpListWithOptions(request, runtime);
    }
}
