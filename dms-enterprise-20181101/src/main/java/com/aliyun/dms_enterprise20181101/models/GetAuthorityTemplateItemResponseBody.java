// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAuthorityTemplateItemResponseBody extends TeaModel {
    /**
     * <p>The permission templates.</p>
     */
    @NameInMap("AuthorityTemplateItemList")
    public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemList authorityTemplateItemList;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5B96E35F-A58E-5399-9041-09CF9A1E46EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetAuthorityTemplateItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorityTemplateItemResponseBody self = new GetAuthorityTemplateItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorityTemplateItemResponseBody setAuthorityTemplateItemList(GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemList authorityTemplateItemList) {
        this.authorityTemplateItemList = authorityTemplateItemList;
        return this;
    }
    public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemList getAuthorityTemplateItemList() {
        return this.authorityTemplateItemList;
    }

    public GetAuthorityTemplateItemResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAuthorityTemplateItemResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAuthorityTemplateItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthorityTemplateItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAuthorityTemplateItemResponseBody setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem extends TeaModel {
        /**
         * <p>The additional information. For example, permissions to log on to an instance are added to the permission template.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;permissionTypes&quot;: [
         *             &quot;LOGIN&quot;
         *           ]</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>43***</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>188****</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>12***</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <p>The ID of the user who modifies the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>51***</p>
         */
        @NameInMap("ModifierId")
        public Long modifierId;

        /**
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li><strong>INSTANCE</strong>: instance</li>
         * <li><strong>LOGIC_DB</strong>: logical database</li>
         * <li><strong>META_DB</strong>: physical database</li>
         * <li><strong>LOGIC_TABLE</strong>: logical table</li>
         * <li><strong>LOGIC_TABLE</strong>: physical table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleTable</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The ID of the permission template.</p>
         * 
         * <strong>example:</strong>
         * <p>1563</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem self = new GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem();
            return TeaModel.build(map, self);
        }

        public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem setModifierId(Long modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public Long getModifierId() {
            return this.modifierId;
        }

        public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemList extends TeaModel {
        @NameInMap("AuthorityTemplateItem")
        public java.util.List<GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem> authorityTemplateItem;

        public static GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemList build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemList self = new GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemList();
            return TeaModel.build(map, self);
        }

        public GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemList setAuthorityTemplateItem(java.util.List<GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem> authorityTemplateItem) {
            this.authorityTemplateItem = authorityTemplateItem;
            return this;
        }
        public java.util.List<GetAuthorityTemplateItemResponseBodyAuthorityTemplateItemListAuthorityTemplateItem> getAuthorityTemplateItem() {
            return this.authorityTemplateItem;
        }

    }

}
