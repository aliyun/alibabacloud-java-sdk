// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateMetaTableRequest extends TeaModel {
    @NameInMap("Caption")
    public String caption;

    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    @NameInMap("Visibility")
    public Integer visibility;

    public static UpdateMetaTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaTableRequest self = new UpdateMetaTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaTableRequest setCaption(String caption) {
        this.caption = caption;
        return this;
    }
    public String getCaption() {
        return this.caption;
    }

    public UpdateMetaTableRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateMetaTableRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public UpdateMetaTableRequest setVisibility(Integer visibility) {
        this.visibility = visibility;
        return this;
    }
    public Integer getVisibility() {
        return this.visibility;
    }

}
