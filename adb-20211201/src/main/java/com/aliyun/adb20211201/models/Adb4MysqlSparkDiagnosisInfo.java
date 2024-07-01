// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class Adb4MysqlSparkDiagnosisInfo extends TeaModel {
    @NameInMap("DiagnosisCode")
    public String diagnosisCode;

    @NameInMap("DiagnosisCodeLabel")
    public String diagnosisCodeLabel;

    @NameInMap("DiagnosisMsg")
    public String diagnosisMsg;

    /**
     * <strong>example:</strong>
     * <p>APPLICATION</p>
     */
    @NameInMap("DiagnosisType")
    public String diagnosisType;

    public static Adb4MysqlSparkDiagnosisInfo build(java.util.Map<String, ?> map) throws Exception {
        Adb4MysqlSparkDiagnosisInfo self = new Adb4MysqlSparkDiagnosisInfo();
        return TeaModel.build(map, self);
    }

    public Adb4MysqlSparkDiagnosisInfo setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
        return this;
    }
    public String getDiagnosisCode() {
        return this.diagnosisCode;
    }

    public Adb4MysqlSparkDiagnosisInfo setDiagnosisCodeLabel(String diagnosisCodeLabel) {
        this.diagnosisCodeLabel = diagnosisCodeLabel;
        return this;
    }
    public String getDiagnosisCodeLabel() {
        return this.diagnosisCodeLabel;
    }

    public Adb4MysqlSparkDiagnosisInfo setDiagnosisMsg(String diagnosisMsg) {
        this.diagnosisMsg = diagnosisMsg;
        return this;
    }
    public String getDiagnosisMsg() {
        return this.diagnosisMsg;
    }

    public Adb4MysqlSparkDiagnosisInfo setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
        return this;
    }
    public String getDiagnosisType() {
        return this.diagnosisType;
    }

}
