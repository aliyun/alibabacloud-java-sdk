// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataCreateProjectShrinkRequest extends TeaModel {
    // createScanUserDataRequest
    @NameInMap("CreateScanUserDataRequest")
    public String createScanUserDataRequestShrink;

    // 项目描述
    @NameInMap("ProjectDesc")
    public String projectDesc;

    // 目前只支持3VJIA
    @NameInMap("Source")
    public String source;

    // 单个人下不允许出现相同项目名
    @NameInMap("ProjectName")
    public String projectName;

    // 业务幂等编号
    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    public static ScanDataCreateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanDataCreateProjectShrinkRequest self = new ScanDataCreateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScanDataCreateProjectShrinkRequest setCreateScanUserDataRequestShrink(String createScanUserDataRequestShrink) {
        this.createScanUserDataRequestShrink = createScanUserDataRequestShrink;
        return this;
    }
    public String getCreateScanUserDataRequestShrink() {
        return this.createScanUserDataRequestShrink;
    }

    public ScanDataCreateProjectShrinkRequest setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
        return this;
    }
    public String getProjectDesc() {
        return this.projectDesc;
    }

    public ScanDataCreateProjectShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ScanDataCreateProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ScanDataCreateProjectShrinkRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

}
