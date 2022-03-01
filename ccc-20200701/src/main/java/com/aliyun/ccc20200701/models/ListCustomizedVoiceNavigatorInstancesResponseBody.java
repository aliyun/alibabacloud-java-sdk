// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCustomizedVoiceNavigatorInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCustomizedVoiceNavigatorInstancesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCustomizedVoiceNavigatorInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizedVoiceNavigatorInstancesResponseBody self = new ListCustomizedVoiceNavigatorInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomizedVoiceNavigatorInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCustomizedVoiceNavigatorInstancesResponseBody setData(java.util.List<ListCustomizedVoiceNavigatorInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCustomizedVoiceNavigatorInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListCustomizedVoiceNavigatorInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCustomizedVoiceNavigatorInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomizedVoiceNavigatorInstancesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListCustomizedVoiceNavigatorInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCustomizedVoiceNavigatorInstancesResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Number")
        public String number;

        public static ListCustomizedVoiceNavigatorInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizedVoiceNavigatorInstancesResponseBodyData self = new ListCustomizedVoiceNavigatorInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomizedVoiceNavigatorInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCustomizedVoiceNavigatorInstancesResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListCustomizedVoiceNavigatorInstancesResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

}
