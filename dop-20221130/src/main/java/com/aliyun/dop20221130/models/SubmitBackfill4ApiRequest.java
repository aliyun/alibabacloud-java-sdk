// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dop20221130.models;

import com.aliyun.tea.*;

public class SubmitBackfill4ApiRequest extends TeaModel {
    @NameInMap("end")
    public String end;

    @NameInMap("packageId")
    public Integer packageId;

    @NameInMap("start")
    public String start;

    public static SubmitBackfill4ApiRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBackfill4ApiRequest self = new SubmitBackfill4ApiRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBackfill4ApiRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public SubmitBackfill4ApiRequest setPackageId(Integer packageId) {
        this.packageId = packageId;
        return this;
    }
    public Integer getPackageId() {
        return this.packageId;
    }

    public SubmitBackfill4ApiRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
