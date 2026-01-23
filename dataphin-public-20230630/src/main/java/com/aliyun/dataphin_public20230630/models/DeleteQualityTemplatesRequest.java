// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteQualityTemplatesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteQualityTemplatesRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteQualityTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityTemplatesRequest self = new DeleteQualityTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityTemplatesRequest setDeleteCommand(DeleteQualityTemplatesRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteQualityTemplatesRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteQualityTemplatesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteQualityTemplatesRequestDeleteCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("TemplateIdList")
        public java.util.List<Long> templateIdList;

        public static DeleteQualityTemplatesRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteQualityTemplatesRequestDeleteCommand self = new DeleteQualityTemplatesRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteQualityTemplatesRequestDeleteCommand setTemplateIdList(java.util.List<Long> templateIdList) {
            this.templateIdList = templateIdList;
            return this;
        }
        public java.util.List<Long> getTemplateIdList() {
            return this.templateIdList;
        }

    }

}
