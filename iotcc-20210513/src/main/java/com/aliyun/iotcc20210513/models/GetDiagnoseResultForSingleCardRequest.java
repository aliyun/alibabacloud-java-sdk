// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetDiagnoseResultForSingleCardRequest extends TeaModel {
    @NameInMap("DiagnoseTaskId")
    public String diagnoseTaskId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetDiagnoseResultForSingleCardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnoseResultForSingleCardRequest self = new GetDiagnoseResultForSingleCardRequest();
        return TeaModel.build(map, self);
    }

    public GetDiagnoseResultForSingleCardRequest setDiagnoseTaskId(String diagnoseTaskId) {
        this.diagnoseTaskId = diagnoseTaskId;
        return this;
    }
    public String getDiagnoseTaskId() {
        return this.diagnoseTaskId;
    }

    public GetDiagnoseResultForSingleCardRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
