// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetDiagnoseResultForSingleCardRequest extends TeaModel {
    @NameInMap("DiagnoseTaskId")
    public String diagnoseTaskId;

    @NameInMap("RegionNo")
    public String regionNo;

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

    public GetDiagnoseResultForSingleCardRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

}
