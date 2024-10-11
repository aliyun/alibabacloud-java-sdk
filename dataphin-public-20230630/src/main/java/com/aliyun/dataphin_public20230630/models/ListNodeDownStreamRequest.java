// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListNodeDownStreamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListNodeDownStreamRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListNodeDownStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeDownStreamRequest self = new ListNodeDownStreamRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeDownStreamRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListNodeDownStreamRequest setListQuery(ListNodeDownStreamRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListNodeDownStreamRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListNodeDownStreamRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListNodeDownStreamRequestListQueryFilterList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Exclude")
        public Boolean exclude;

        /**
         * <strong>example:</strong>
         * <p>PROJECT</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static ListNodeDownStreamRequestListQueryFilterList build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDownStreamRequestListQueryFilterList self = new ListNodeDownStreamRequestListQueryFilterList();
            return TeaModel.build(map, self);
        }

        public ListNodeDownStreamRequestListQueryFilterList setExclude(Boolean exclude) {
            this.exclude = exclude;
            return this;
        }
        public Boolean getExclude() {
            return this.exclude;
        }

        public ListNodeDownStreamRequestListQueryFilterList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListNodeDownStreamRequestListQueryFilterList setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class ListNodeDownStreamRequestListQueryNodeIdList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>112</p>
         */
        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

        /**
         * <strong>example:</strong>
         * <p>n_23431</p>
         */
        @NameInMap("Id")
        public String id;

        public static ListNodeDownStreamRequestListQueryNodeIdList build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDownStreamRequestListQueryNodeIdList self = new ListNodeDownStreamRequestListQueryNodeIdList();
            return TeaModel.build(map, self);
        }

        public ListNodeDownStreamRequestListQueryNodeIdList setFieldIdList(java.util.List<String> fieldIdList) {
            this.fieldIdList = fieldIdList;
            return this;
        }
        public java.util.List<String> getFieldIdList() {
            return this.fieldIdList;
        }

        public ListNodeDownStreamRequestListQueryNodeIdList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListNodeDownStreamRequestListQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownStreamDepth")
        public Integer downStreamDepth;

        @NameInMap("FilterList")
        public java.util.List<ListNodeDownStreamRequestListQueryFilterList> filterList;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeIdList")
        public java.util.List<ListNodeDownStreamRequestListQueryNodeIdList> nodeIdList;

        /**
         * <strong>example:</strong>
         * <p>123011</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static ListNodeDownStreamRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListNodeDownStreamRequestListQuery self = new ListNodeDownStreamRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListNodeDownStreamRequestListQuery setDownStreamDepth(Integer downStreamDepth) {
            this.downStreamDepth = downStreamDepth;
            return this;
        }
        public Integer getDownStreamDepth() {
            return this.downStreamDepth;
        }

        public ListNodeDownStreamRequestListQuery setFilterList(java.util.List<ListNodeDownStreamRequestListQueryFilterList> filterList) {
            this.filterList = filterList;
            return this;
        }
        public java.util.List<ListNodeDownStreamRequestListQueryFilterList> getFilterList() {
            return this.filterList;
        }

        public ListNodeDownStreamRequestListQuery setNodeIdList(java.util.List<ListNodeDownStreamRequestListQueryNodeIdList> nodeIdList) {
            this.nodeIdList = nodeIdList;
            return this;
        }
        public java.util.List<ListNodeDownStreamRequestListQueryNodeIdList> getNodeIdList() {
            return this.nodeIdList;
        }

        public ListNodeDownStreamRequestListQuery setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
