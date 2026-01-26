// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvDropMetricsRuleRequest extends TeaModel {
    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li>zh (default)</li>
     * <li>en</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The metric to be discarded. Separate multiple metrics with line feeds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>metric_1
     * metric_2
     * metric_3</p>
     */
    @NameInMap("DropMetrics")
    public String dropMetrics;

    /**
     * <p>The environment ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateEnvDropMetricsRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvDropMetricsRuleRequest self = new UpdateEnvDropMetricsRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvDropMetricsRuleRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public UpdateEnvDropMetricsRuleRequest setDropMetrics(String dropMetrics) {
        this.dropMetrics = dropMetrics;
        return this;
    }
    public String getDropMetrics() {
        return this.dropMetrics;
    }

    public UpdateEnvDropMetricsRuleRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UpdateEnvDropMetricsRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
