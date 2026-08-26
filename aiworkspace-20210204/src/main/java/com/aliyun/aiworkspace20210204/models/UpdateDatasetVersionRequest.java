// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetVersionRequest extends TeaModel {
    /**
     * <p>The number of dataset files.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DataCount")
    public Long dataCount;

    /**
     * <p>The size of the space occupied by dataset files. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("DataSize")
    public Long dataSize;

    /**
     * <p>DatasetTaskRamRole</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890123456:role/role-name</p>
     */
    @NameInMap("DatasetTaskRamRole")
    public String datasetTaskRamRole;

    /**
     * <p>The custom description of the dataset, which is used to distinguish different datasets.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of a dataset version.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The extended field in JsonString format. When DLC uses the dataset, you can specify the default mount path of the dataset by configuring the mountPath field.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;mountPath&quot;: &quot;/mnt/data/&quot;
     * }</p>
     */
    @NameInMap("Options")
    public String options;

    @NameInMap("UserMetricsEndpoints")
    public java.util.List<UserMetricsEndpoint> userMetricsEndpoints;

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

    public UpdateDatasetVersionRequest setDatasetTaskRamRole(String datasetTaskRamRole) {
        this.datasetTaskRamRole = datasetTaskRamRole;
        return this;
    }
    public String getDatasetTaskRamRole() {
        return this.datasetTaskRamRole;
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

    public UpdateDatasetVersionRequest setUserMetricsEndpoints(java.util.List<UserMetricsEndpoint> userMetricsEndpoints) {
        this.userMetricsEndpoints = userMetricsEndpoints;
        return this;
    }
    public java.util.List<UserMetricsEndpoint> getUserMetricsEndpoints() {
        return this.userMetricsEndpoints;
    }

}
