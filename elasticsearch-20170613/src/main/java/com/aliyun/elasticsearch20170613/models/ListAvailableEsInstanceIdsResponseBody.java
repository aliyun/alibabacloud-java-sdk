// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAvailableEsInstanceIdsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListAvailableEsInstanceIdsResponseBodyResult> result;

    public static ListAvailableEsInstanceIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableEsInstanceIdsResponseBody self = new ListAvailableEsInstanceIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableEsInstanceIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableEsInstanceIdsResponseBody setResult(java.util.List<ListAvailableEsInstanceIdsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAvailableEsInstanceIdsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAvailableEsInstanceIdsResponseBodyResult extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("esInstanceId")
        public String esInstanceId;

        @NameInMap("kibanaEndpoint")
        public String kibanaEndpoint;

        public static ListAvailableEsInstanceIdsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableEsInstanceIdsResponseBodyResult self = new ListAvailableEsInstanceIdsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAvailableEsInstanceIdsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAvailableEsInstanceIdsResponseBodyResult setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListAvailableEsInstanceIdsResponseBodyResult setEsInstanceId(String esInstanceId) {
            this.esInstanceId = esInstanceId;
            return this;
        }
        public String getEsInstanceId() {
            return this.esInstanceId;
        }

        public ListAvailableEsInstanceIdsResponseBodyResult setKibanaEndpoint(String kibanaEndpoint) {
            this.kibanaEndpoint = kibanaEndpoint;
            return this;
        }
        public String getKibanaEndpoint() {
            return this.kibanaEndpoint;
        }

    }

}
