// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDatasetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("WithStatistics")
    public Boolean withStatistics;

    public static GetDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetRequest self = new GetDatasetRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetDatasetRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetDatasetRequest setWithStatistics(Boolean withStatistics) {
        this.withStatistics = withStatistics;
        return this;
    }
    public Boolean getWithStatistics() {
        return this.withStatistics;
    }

}
