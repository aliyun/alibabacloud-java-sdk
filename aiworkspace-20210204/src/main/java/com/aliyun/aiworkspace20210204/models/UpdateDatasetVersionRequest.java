// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    /**
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;mountPath&quot;: &quot;/mnt/data/&quot;
     * }</p>
     */
    @NameInMap("Options")
    public String options;

    public static UpdateDatasetVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetVersionRequest self = new UpdateDatasetVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetVersionRequest setDataCount(Long dataCount) {
        this.dataCount = dataCount;
        return this;
    }
    public Long getDataCount() {
        return this.dataCount;
    }

    public UpdateDatasetVersionRequest setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public UpdateDatasetVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDatasetVersionRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}
