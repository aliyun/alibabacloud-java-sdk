// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SaveProjectSettingRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Switchs")
    public java.util.List<SaveProjectSettingRequestSwitchs> switchs;

    public static SaveProjectSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveProjectSettingRequest self = new SaveProjectSettingRequest();
        return TeaModel.build(map, self);
    }

    public SaveProjectSettingRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SaveProjectSettingRequest setSwitchs(java.util.List<SaveProjectSettingRequestSwitchs> switchs) {
        this.switchs = switchs;
        return this;
    }
    public java.util.List<SaveProjectSettingRequestSwitchs> getSwitchs() {
        return this.switchs;
    }

    public static class SaveProjectSettingRequestSwitchs extends TeaModel {
        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobType")
        public Integer jobType;

        @NameInMap("ModeName")
        public String modeName;

        @NameInMap("ModeType")
        public Integer modeType;

        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("Visible")
        public Boolean visible;

        public static SaveProjectSettingRequestSwitchs build(java.util.Map<String, ?> map) throws Exception {
            SaveProjectSettingRequestSwitchs self = new SaveProjectSettingRequestSwitchs();
            return TeaModel.build(map, self);
        }

        public SaveProjectSettingRequestSwitchs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public SaveProjectSettingRequestSwitchs setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public SaveProjectSettingRequestSwitchs setModeName(String modeName) {
            this.modeName = modeName;
            return this;
        }
        public String getModeName() {
            return this.modeName;
        }

        public SaveProjectSettingRequestSwitchs setModeType(Integer modeType) {
            this.modeType = modeType;
            return this;
        }
        public Integer getModeType() {
            return this.modeType;
        }

        public SaveProjectSettingRequestSwitchs setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public SaveProjectSettingRequestSwitchs setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

}
