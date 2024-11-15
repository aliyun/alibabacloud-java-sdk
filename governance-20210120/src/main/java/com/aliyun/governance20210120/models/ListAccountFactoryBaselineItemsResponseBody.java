// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListAccountFactoryBaselineItemsResponseBody extends TeaModel {
    /**
     * <p>The baseline items.</p>
     */
    @NameInMap("BaselineItems")
    public java.util.List<ListAccountFactoryBaselineItemsResponseBodyBaselineItems> baselineItems;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAACDGQdAEX3m42z3sQ+f3VTK2Xr2DzYbz/SAfc/zJRqod</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B40D73D8-76AC-5D3C-AC63-4FC8AFCE6671</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAccountFactoryBaselineItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountFactoryBaselineItemsResponseBody self = new ListAccountFactoryBaselineItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountFactoryBaselineItemsResponseBody setBaselineItems(java.util.List<ListAccountFactoryBaselineItemsResponseBodyBaselineItems> baselineItems) {
        this.baselineItems = baselineItems;
        return this;
    }
    public java.util.List<ListAccountFactoryBaselineItemsResponseBodyBaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    public ListAccountFactoryBaselineItemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccountFactoryBaselineItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccountFactoryBaselineItemsResponseBodyBaselineItemsDependsOn extends TeaModel {
        /**
         * <p>The name of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>AccountFactory</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAccountFactoryBaselineItemsResponseBodyBaselineItemsDependsOn build(java.util.Map<String, ?> map) throws Exception {
            ListAccountFactoryBaselineItemsResponseBodyBaselineItemsDependsOn self = new ListAccountFactoryBaselineItemsResponseBodyBaselineItemsDependsOn();
            return TeaModel.build(map, self);
        }

        public ListAccountFactoryBaselineItemsResponseBodyBaselineItemsDependsOn setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAccountFactoryBaselineItemsResponseBodyBaselineItemsDependsOn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAccountFactoryBaselineItemsResponseBodyBaselineItemsDependsOn setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAccountFactoryBaselineItemsResponseBodyBaselineItems extends TeaModel {
        /**
         * <p>The dependency of the baseline item.</p>
         */
        @NameInMap("DependsOn")
        public java.util.List<ListAccountFactoryBaselineItemsResponseBodyBaselineItemsDependsOn> dependsOn;

        /**
         * <p>The description of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>Notification.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-BP_ACCOUNT_FACTORY_ACCOUNT_NOTIFICATION</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>AccountFactory</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAccountFactoryBaselineItemsResponseBodyBaselineItems build(java.util.Map<String, ?> map) throws Exception {
            ListAccountFactoryBaselineItemsResponseBodyBaselineItems self = new ListAccountFactoryBaselineItemsResponseBodyBaselineItems();
            return TeaModel.build(map, self);
        }

        public ListAccountFactoryBaselineItemsResponseBodyBaselineItems setDependsOn(java.util.List<ListAccountFactoryBaselineItemsResponseBodyBaselineItemsDependsOn> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public java.util.List<ListAccountFactoryBaselineItemsResponseBodyBaselineItemsDependsOn> getDependsOn() {
            return this.dependsOn;
        }

        public ListAccountFactoryBaselineItemsResponseBodyBaselineItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAccountFactoryBaselineItemsResponseBodyBaselineItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAccountFactoryBaselineItemsResponseBodyBaselineItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAccountFactoryBaselineItemsResponseBodyBaselineItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
