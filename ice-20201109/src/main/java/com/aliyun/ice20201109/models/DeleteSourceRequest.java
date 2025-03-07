// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteSourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to use delete markers.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SoftDelete")
    public Boolean softDelete;

    /**
     * <p>The name of the source location.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    /**
     * <p>The name of the source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyVodSource</p>
     */
    @NameInMap("SourceName")
    public String sourceName;

    /**
     * <p>The source type. Valid values: vodSource and liveSource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vodSource</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static DeleteSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceRequest self = new DeleteSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSourceRequest setSoftDelete(Boolean softDelete) {
        this.softDelete = softDelete;
        return this;
    }
    public Boolean getSoftDelete() {
        return this.softDelete;
    }

    public DeleteSourceRequest setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public DeleteSourceRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public DeleteSourceRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
