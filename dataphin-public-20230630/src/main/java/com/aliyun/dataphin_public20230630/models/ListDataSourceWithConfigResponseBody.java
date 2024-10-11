// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataSourceWithConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListDataSourceWithConfigResponseBodyPageResult pageResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataSourceWithConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceWithConfigResponseBody self = new ListDataSourceWithConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceWithConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataSourceWithConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataSourceWithConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataSourceWithConfigResponseBody setPageResult(ListDataSourceWithConfigResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListDataSourceWithConfigResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListDataSourceWithConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourceWithConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfoConfigItemList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfoConfigItemList build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfoConfigItemList self = new ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfoConfigItemList();
            return TeaModel.build(map, self);
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfoConfigItemList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfoConfigItemList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo extends TeaModel {
        @NameInMap("ConfigItemList")
        public java.util.List<ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfoConfigItemList> configItemList;

        /**
         * <strong>example:</strong>
         * <p>1710209552704</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>212211111</p>
         */
        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>12313123131</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1710209552704</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>212211111</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo self = new ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setConfigItemList(java.util.List<ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfoConfigItemList> configItemList) {
            this.configItemList = configItemList;
            return this;
        }
        public java.util.List<ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfoConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfoConfigItemList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfoConfigItemList build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfoConfigItemList self = new ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfoConfigItemList();
            return TeaModel.build(map, self);
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfoConfigItemList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfoConfigItemList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo extends TeaModel {
        @NameInMap("ConfigItemList")
        public java.util.List<ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfoConfigItemList> configItemList;

        /**
         * <strong>example:</strong>
         * <p>1708303959000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>212211111</p>
         */
        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>300000028799</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1708303959000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>212211111</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo self = new ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo();
            return TeaModel.build(map, self);
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setConfigItemList(java.util.List<ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfoConfigItemList> configItemList) {
            this.configItemList = configItemList;
            return this;
        }
        public java.util.List<ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfoConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataSourceWithConfigResponseBodyPageResultDataSourceList extends TeaModel {
        /**
         * <p>开发环境数据源信息</p>
         */
        @NameInMap("DevDataSourceInfo")
        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo devDataSourceInfo;

        /**
         * <p>生产环境数据源</p>
         */
        @NameInMap("ProdDataSourceInfo")
        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo prodDataSourceInfo;

        public static ListDataSourceWithConfigResponseBodyPageResultDataSourceList build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceWithConfigResponseBodyPageResultDataSourceList self = new ListDataSourceWithConfigResponseBodyPageResultDataSourceList();
            return TeaModel.build(map, self);
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceList setDevDataSourceInfo(ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo devDataSourceInfo) {
            this.devDataSourceInfo = devDataSourceInfo;
            return this;
        }
        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListDevDataSourceInfo getDevDataSourceInfo() {
            return this.devDataSourceInfo;
        }

        public ListDataSourceWithConfigResponseBodyPageResultDataSourceList setProdDataSourceInfo(ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo prodDataSourceInfo) {
            this.prodDataSourceInfo = prodDataSourceInfo;
            return this;
        }
        public ListDataSourceWithConfigResponseBodyPageResultDataSourceListProdDataSourceInfo getProdDataSourceInfo() {
            return this.prodDataSourceInfo;
        }

    }

    public static class ListDataSourceWithConfigResponseBodyPageResult extends TeaModel {
        @NameInMap("DataSourceList")
        public java.util.List<ListDataSourceWithConfigResponseBodyPageResultDataSourceList> dataSourceList;

        /**
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDataSourceWithConfigResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceWithConfigResponseBodyPageResult self = new ListDataSourceWithConfigResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListDataSourceWithConfigResponseBodyPageResult setDataSourceList(java.util.List<ListDataSourceWithConfigResponseBodyPageResultDataSourceList> dataSourceList) {
            this.dataSourceList = dataSourceList;
            return this;
        }
        public java.util.List<ListDataSourceWithConfigResponseBodyPageResultDataSourceList> getDataSourceList() {
            return this.dataSourceList;
        }

        public ListDataSourceWithConfigResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
