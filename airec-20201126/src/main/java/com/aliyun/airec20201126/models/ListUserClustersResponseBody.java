// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListUserClustersResponseBody extends TeaModel {
    @NameInMap("headers")
    public ListUserClustersResponseBodyHeaders headers;

    /**
     * <strong>example:</strong>
     * <p>1E2CBBA8-C623-4FEE-BC84-9672E460CA39</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListUserClustersResponseBodyResult> result;

    public static ListUserClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserClustersResponseBody self = new ListUserClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserClustersResponseBody setHeaders(ListUserClustersResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListUserClustersResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListUserClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserClustersResponseBody setResult(java.util.List<ListUserClustersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListUserClustersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListUserClustersResponseBodyHeaders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListUserClustersResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListUserClustersResponseBodyHeaders self = new ListUserClustersResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListUserClustersResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListUserClustersResponseBodyResultMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tst</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>UserCluster</p>
         */
        @NameInMap("metaType")
        public String metaType;

        public static ListUserClustersResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ListUserClustersResponseBodyResultMeta self = new ListUserClustersResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ListUserClustersResponseBodyResultMeta setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserClustersResponseBodyResultMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

    }

    public static class ListUserClustersResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>meta</p>
         */
        @NameInMap("meta")
        public ListUserClustersResponseBodyResultMeta meta;

        /**
         * <strong>example:</strong>
         * <p>mycluster-for-airec</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public String status;

        public static ListUserClustersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserClustersResponseBodyResult self = new ListUserClustersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListUserClustersResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUserClustersResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListUserClustersResponseBodyResult setMeta(ListUserClustersResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListUserClustersResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public ListUserClustersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserClustersResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
