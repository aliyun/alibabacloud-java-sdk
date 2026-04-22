// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class ListAclGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("data")
    public java.util.List<ListAclGroupsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>66A13C31-473A-5B3A-8974-0B07A40649CF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAclGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAclGroupsResponseBody self = new ListAclGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAclGroupsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAclGroupsResponseBody setData(java.util.List<ListAclGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAclGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListAclGroupsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAclGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAclGroupsResponseBodyData extends TeaModel {
        @NameInMap("cidrs")
        public java.util.List<String> cidrs;

        /**
         * <strong>example:</strong>
         * <p>2022-10-17T13:53:27Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>376774</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>c-xxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>50832118</p>
         */
        @NameInMap("uid")
        public Long uid;

        public static ListAclGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAclGroupsResponseBodyData self = new ListAclGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAclGroupsResponseBodyData setCidrs(java.util.List<String> cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public java.util.List<String> getCidrs() {
            return this.cidrs;
        }

        public ListAclGroupsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAclGroupsResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListAclGroupsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAclGroupsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAclGroupsResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

}
