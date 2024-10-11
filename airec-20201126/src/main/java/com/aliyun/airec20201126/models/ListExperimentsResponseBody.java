// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListExperimentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E3D6FE3B-B7C2-43DA-9A13-5EA837ACED9B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListExperimentsResponseBodyResult> result;

    public static ListExperimentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentsResponseBody self = new ListExperimentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentsResponseBody setResult(java.util.List<ListExperimentsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListExperimentsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListExperimentsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("base")
        public Boolean base;

        @NameInMap("buckets")
        public java.util.List<String> buckets;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("experimentId")
        public String experimentId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2020-12-07T06:47:30.000Z</p>
         */
        @NameInMap("offlineTime")
        public String offlineTime;

        /**
         * <strong>example:</strong>
         * <p>2020-12-07T06:47:30.000Z</p>
         */
        @NameInMap("onlineTime")
        public String onlineTime;

        /**
         * <strong>example:</strong>
         * <p>init</p>
         */
        @NameInMap("status")
        public String status;

        public static ListExperimentsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentsResponseBodyResult self = new ListExperimentsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListExperimentsResponseBodyResult setBase(Boolean base) {
            this.base = base;
            return this;
        }
        public Boolean getBase() {
            return this.base;
        }

        public ListExperimentsResponseBodyResult setBuckets(java.util.List<String> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<String> getBuckets() {
            return this.buckets;
        }

        public ListExperimentsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExperimentsResponseBodyResult setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListExperimentsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExperimentsResponseBodyResult setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public ListExperimentsResponseBodyResult setOnlineTime(String onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public String getOnlineTime() {
            return this.onlineTime;
        }

        public ListExperimentsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
