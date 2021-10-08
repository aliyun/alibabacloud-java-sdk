// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutDiagInfoRequest extends TeaModel {
    @NameInMap("Uid")
    public Long uid;

    @NameInMap("Starttime")
    public Long starttime;

    @NameInMap("Endtime")
    public Long endtime;

    @NameInMap("DiagInfo")
    public String diagInfo;

    public static PutDiagInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDiagInfoRequest self = new PutDiagInfoRequest();
        return TeaModel.build(map, self);
    }

    public PutDiagInfoRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public PutDiagInfoRequest setStarttime(Long starttime) {
        this.starttime = starttime;
        return this;
    }
    public Long getStarttime() {
        return this.starttime;
    }

    public PutDiagInfoRequest setEndtime(Long endtime) {
        this.endtime = endtime;
        return this;
    }
    public Long getEndtime() {
        return this.endtime;
    }

    public PutDiagInfoRequest setDiagInfo(String diagInfo) {
        this.diagInfo = diagInfo;
        return this;
    }
    public String getDiagInfo() {
        return this.diagInfo;
    }

}
