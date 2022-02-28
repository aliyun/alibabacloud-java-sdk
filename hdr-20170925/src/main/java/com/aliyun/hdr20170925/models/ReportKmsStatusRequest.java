// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportKmsStatusRequest extends TeaModel {
    @NameInMap("HardwareId")
    public String hardwareId;

    @NameInMap("Output")
    public String output;

    @NameInMap("Succeed")
    public Boolean succeed;

    public static ReportKmsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportKmsStatusRequest self = new ReportKmsStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportKmsStatusRequest setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
        return this;
    }
    public String getHardwareId() {
        return this.hardwareId;
    }

    public ReportKmsStatusRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public ReportKmsStatusRequest setSucceed(Boolean succeed) {
        this.succeed = succeed;
        return this;
    }
    public Boolean getSucceed() {
        return this.succeed;
    }

}
