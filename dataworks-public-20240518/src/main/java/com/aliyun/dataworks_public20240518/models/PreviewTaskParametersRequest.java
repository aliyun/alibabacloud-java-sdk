// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PreviewTaskParametersRequest extends TeaModel {
    /**
     * <p>The business date. The value is a 13-digit UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1792425600000</p>
     */
    @NameInMap("Bizdate")
    public Long bizdate;

    /**
     * <p>The scheduling CRON expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00 00 00 * * ?</p>
     */
    @NameInMap("Cron")
    public String cron;

    /**
     * <p>The list of script parameters. The length cannot exceed 65,535 characters. Separate multiple parameters with spaces, such as para1=$bizdate para2=$[hh24]. An empty string is allowed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>para1=$bizdate para2=$[hh24]</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The number of scheduling cycles to preview. Valid values: 1 to 10. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PreviewCount")
    public Integer previewCount;

    /**
     * <p>The project environment. Valid values:</p>
     * <ul>
     * <li>Prod: production</li>
     * <li>Dev: development
     * Default value: Prod.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The workspace ID. The workspace must belong to the current tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The preview start time for the first scheduling day. The format is HH:mm:ss. Default value: 00:00:00. This parameter takes effect only for non-daily schedules and is used to filter out cycles that occur before this time on the first scheduling day.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static PreviewTaskParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewTaskParametersRequest self = new PreviewTaskParametersRequest();
        return TeaModel.build(map, self);
    }

    public PreviewTaskParametersRequest setBizdate(Long bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public Long getBizdate() {
        return this.bizdate;
    }

    public PreviewTaskParametersRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public PreviewTaskParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public PreviewTaskParametersRequest setPreviewCount(Integer previewCount) {
        this.previewCount = previewCount;
        return this;
    }
    public Integer getPreviewCount() {
        return this.previewCount;
    }

    public PreviewTaskParametersRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public PreviewTaskParametersRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public PreviewTaskParametersRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
