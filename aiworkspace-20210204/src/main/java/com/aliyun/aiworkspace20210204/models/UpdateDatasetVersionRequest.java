// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetVersionRequest extends TeaModel {
    /**
     * <p>The number of files in the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    /**
     * <p>The size of the dataset files, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>A custom description of the dataset to distinguish it from other datasets.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of a dataset version.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>An extension field in the JSON String format.
     * When DLC uses the dataset, you can configure the mountPath field to specify the default mount path.</p>
     * 
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
