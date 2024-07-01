// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeEnabledPrivilegesResponseBody extends TeaModel {
    /**
     * <p>The queried permission level and permissions.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeEnabledPrivilegesResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>246F42E0-A475-15FF-96D2-8DC47FC2F289</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnabledPrivilegesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnabledPrivilegesResponseBody self = new DescribeEnabledPrivilegesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnabledPrivilegesResponseBody setData(java.util.List<DescribeEnabledPrivilegesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeEnabledPrivilegesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeEnabledPrivilegesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnabledPrivilegesResponseBodyDataPrivileges extends TeaModel {
        /**
         * <p>The description of the permission.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("Key")
        public String key;

        public static DescribeEnabledPrivilegesResponseBodyDataPrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnabledPrivilegesResponseBodyDataPrivileges self = new DescribeEnabledPrivilegesResponseBodyDataPrivileges();
            return TeaModel.build(map, self);
        }

        public DescribeEnabledPrivilegesResponseBodyDataPrivileges setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEnabledPrivilegesResponseBodyDataPrivileges setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class DescribeEnabledPrivilegesResponseBodyData extends TeaModel {
        /**
         * <p>The description of the permission level.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The queried permissions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Privileges")
        public java.util.List<DescribeEnabledPrivilegesResponseBodyDataPrivileges> privileges;

        /**
         * <p>The permission level.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("Scope")
        public String scope;

        public static DescribeEnabledPrivilegesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnabledPrivilegesResponseBodyData self = new DescribeEnabledPrivilegesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEnabledPrivilegesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEnabledPrivilegesResponseBodyData setPrivileges(java.util.List<DescribeEnabledPrivilegesResponseBodyDataPrivileges> privileges) {
            this.privileges = privileges;
            return this;
        }
        public java.util.List<DescribeEnabledPrivilegesResponseBodyDataPrivileges> getPrivileges() {
            return this.privileges;
        }

        public DescribeEnabledPrivilegesResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
