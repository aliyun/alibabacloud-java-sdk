// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeEnabledPrivilegesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeEnabledPrivilegesResponseBodyData> data;

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
        @NameInMap("Description")
        public String description;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Privileges")
        public java.util.List<DescribeEnabledPrivilegesResponseBodyDataPrivileges> privileges;

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
