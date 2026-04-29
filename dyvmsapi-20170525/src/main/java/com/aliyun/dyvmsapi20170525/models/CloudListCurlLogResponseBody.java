// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListCurlLogResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListCurlLogResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudListCurlLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListCurlLogResponseBody self = new CloudListCurlLogResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListCurlLogResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListCurlLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListCurlLogResponseBody setData(CloudListCurlLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListCurlLogResponseBodyData getData() {
        return this.data;
    }

    public CloudListCurlLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListCurlLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListCurlLogResponseBodyDataList extends TeaModel {
        /**
         * <p>文本类型</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ContentType")
        public Long contentType;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1774822134415</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>当月</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("CurrentMonth")
        public String currentMonth;

        /**
         * <p>延迟推送时间</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <p>推送结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1774822137959</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>企业id</p>
         * 
         * <strong>example:</strong>
         * <p>7122600</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>请求头</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Headers")
        public String headers;

        /**
         * <p>日志id</p>
         * 
         * <strong>example:</strong>
         * <p>12715</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>推送登记</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <p>推送方法</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>推送参数</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <p>推送位置</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Position")
        public String position;

        /**
         * <p>推送时间</p>
         * 
         * <strong>example:</strong>
         * <p>1774822137191</p>
         */
        @NameInMap("RequestTime")
        public String requestTime;

        /**
         * <p>推送状态</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>返回文本</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ResultText")
        public String resultText;

        /**
         * <p>重试次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Retry")
        public Long retry;

        /**
         * <p>推送开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1774822134132</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>超时时间</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Timeout")
        public String timeout;

        /**
         * <p>推送类型</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Type")
        public Long type;

        /**
         * <p>推送类型字符串</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("TypeStr")
        public String typeStr;

        /**
         * <p>唯一标示</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        /**
         * <p>推送url</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aaa.com/index.htm">https://www.aaa.com/index.htm</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static CloudListCurlLogResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudListCurlLogResponseBodyDataList self = new CloudListCurlLogResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudListCurlLogResponseBodyDataList setContentType(Long contentType) {
            this.contentType = contentType;
            return this;
        }
        public Long getContentType() {
            return this.contentType;
        }

        public CloudListCurlLogResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudListCurlLogResponseBodyDataList setCurrentMonth(String currentMonth) {
            this.currentMonth = currentMonth;
            return this;
        }
        public String getCurrentMonth() {
            return this.currentMonth;
        }

        public CloudListCurlLogResponseBodyDataList setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public CloudListCurlLogResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CloudListCurlLogResponseBodyDataList setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudListCurlLogResponseBodyDataList setHeaders(String headers) {
            this.headers = headers;
            return this;
        }
        public String getHeaders() {
            return this.headers;
        }

        public CloudListCurlLogResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudListCurlLogResponseBodyDataList setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public CloudListCurlLogResponseBodyDataList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CloudListCurlLogResponseBodyDataList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public CloudListCurlLogResponseBodyDataList setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public CloudListCurlLogResponseBodyDataList setRequestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public String getRequestTime() {
            return this.requestTime;
        }

        public CloudListCurlLogResponseBodyDataList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CloudListCurlLogResponseBodyDataList setResultText(String resultText) {
            this.resultText = resultText;
            return this;
        }
        public String getResultText() {
            return this.resultText;
        }

        public CloudListCurlLogResponseBodyDataList setRetry(Long retry) {
            this.retry = retry;
            return this;
        }
        public Long getRetry() {
            return this.retry;
        }

        public CloudListCurlLogResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudListCurlLogResponseBodyDataList setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public CloudListCurlLogResponseBodyDataList setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public CloudListCurlLogResponseBodyDataList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public CloudListCurlLogResponseBodyDataList setTypeStr(String typeStr) {
            this.typeStr = typeStr;
            return this;
        }
        public String getTypeStr() {
            return this.typeStr;
        }

        public CloudListCurlLogResponseBodyDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public CloudListCurlLogResponseBodyDataList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CloudListCurlLogResponseBodyData extends TeaModel {
        /**
         * <p>返回数据JSON格式</p>
         */
        @NameInMap("List")
        public java.util.List<CloudListCurlLogResponseBodyDataList> list;

        public static CloudListCurlLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListCurlLogResponseBodyData self = new CloudListCurlLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListCurlLogResponseBodyData setList(java.util.List<CloudListCurlLogResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudListCurlLogResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
