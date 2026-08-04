// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class JudgeAgExistQuietPeriodRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgAccountType")
    public String agAccountType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mpk")
    public String mpk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Pk")
    public String pk;

    public static JudgeAgExistQuietPeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeAgExistQuietPeriodRequest self = new JudgeAgExistQuietPeriodRequest();
        return TeaModel.build(map, self);
    }

    public JudgeAgExistQuietPeriodRequest setAgAccountType(String agAccountType) {
        this.agAccountType = agAccountType;
        return this;
    }
    public String getAgAccountType() {
        return this.agAccountType;
    }

    public JudgeAgExistQuietPeriodRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public JudgeAgExistQuietPeriodRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public JudgeAgExistQuietPeriodRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
