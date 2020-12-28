// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CheckExperimentRunnableRequest extends TeaModel {
    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static CheckExperimentRunnableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckExperimentRunnableRequest self = new CheckExperimentRunnableRequest();
        return TeaModel.build(map, self);
    }

    public CheckExperimentRunnableRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CheckExperimentRunnableRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public CheckExperimentRunnableRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
