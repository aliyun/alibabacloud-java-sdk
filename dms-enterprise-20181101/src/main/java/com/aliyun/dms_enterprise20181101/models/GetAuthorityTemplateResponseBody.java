// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAuthorityTemplateResponseBody extends TeaModel {
    /**
     * <p>The details of the permission template.</p>
     */
    @NameInMap("AuthorityTemplateView")
    public GetAuthorityTemplateResponseBodyAuthorityTemplateView authorityTemplateView;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tid")
    public Long tid;

    public static GetAuthorityTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorityTemplateResponseBody self = new GetAuthorityTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorityTemplateResponseBody setAuthorityTemplateView(GetAuthorityTemplateResponseBodyAuthorityTemplateView authorityTemplateView) {
        this.authorityTemplateView = authorityTemplateView;
        return this;
    }
    public GetAuthorityTemplateResponseBodyAuthorityTemplateView getAuthorityTemplateView() {
        return this.authorityTemplateView;
    }

    public GetAuthorityTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAuthorityTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAuthorityTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthorityTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAuthorityTemplateResponseBody setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem extends TeaModel {
        /**
         * <p>Other information. For example, you can add the logon permission on an instance to the permission template.</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The ID of the database.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <p>The ID of the user who modified the resource.</p>
         */
        @NameInMap("ModifierId")
        public Long modifierId;

        /**
         * <p>The type of the resource. Valid values:</p>
         * <br>
         * <p>*   **INSTANCE**: instance</p>
         * <p>*   **LOGIC_DB**: logical database</p>
         * <p>*   **META_DB**: physical database</p>
         * <p>*   **LOGIC_TABLE**: logical table</p>
         * <p>*   **SINGLE_TABLE**: physical table</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The ID of the permission template.</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem self = new GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem();
            return TeaModel.build(map, self);
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem setModifierId(Long modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public Long getModifierId() {
            return this.modifierId;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemList extends TeaModel {
        @NameInMap("AuthorityTemplateItem")
        public java.util.List<GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem> authorityTemplateItem;

        public static GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemList build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemList self = new GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemList();
            return TeaModel.build(map, self);
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemList setAuthorityTemplateItem(java.util.List<GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem> authorityTemplateItem) {
            this.authorityTemplateItem = authorityTemplateItem;
            return this;
        }
        public java.util.List<GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemListAuthorityTemplateItem> getAuthorityTemplateItem() {
            return this.authorityTemplateItem;
        }

    }

    public static class GetAuthorityTemplateResponseBodyAuthorityTemplateView extends TeaModel {
        /**
         * <p>The resource information in the permission template.</p>
         */
        @NameInMap("AuthorityTemplateItemList")
        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemList authorityTemplateItemList;

        /**
         * <p>The time when the permission template was created. The time is in the yyyy-MM-DD HH:mm:ss format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the user who created the permission template.</p>
         */
        @NameInMap("CreatorId")
        public Long creatorId;

        /**
         * <p>The description of the permission template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the permission template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the permission template.</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static GetAuthorityTemplateResponseBodyAuthorityTemplateView build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorityTemplateResponseBodyAuthorityTemplateView self = new GetAuthorityTemplateResponseBodyAuthorityTemplateView();
            return TeaModel.build(map, self);
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateView setAuthorityTemplateItemList(GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemList authorityTemplateItemList) {
            this.authorityTemplateItemList = authorityTemplateItemList;
            return this;
        }
        public GetAuthorityTemplateResponseBodyAuthorityTemplateViewAuthorityTemplateItemList getAuthorityTemplateItemList() {
            return this.authorityTemplateItemList;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateView setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateView setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateView setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateView setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAuthorityTemplateResponseBodyAuthorityTemplateView setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
