// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectDetailResponse extends TeaModel {
    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetProjectDetailResponseData data;

    public static GetProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectDetailResponse self = new GetProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class GetProjectDetailResponseData extends TeaModel {
        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("MaxFlowNode")
        @Validation(required = true)
        public Integer maxFlowNode;

        @NameInMap("DefaultDiResourceGroupIdentifier")
        @Validation(required = true)
        public String defaultDiResourceGroupIdentifier;

        @NameInMap("Destination")
        @Validation(required = true)
        public Integer destination;

        @NameInMap("IsAllowDownload")
        @Validation(required = true)
        public Integer isAllowDownload;

        @NameInMap("ProdStorageQuota")
        @Validation(required = true)
        public String prodStorageQuota;

        @NameInMap("SchedulerRetryInterval")
        @Validation(required = true)
        public Integer schedulerRetryInterval;

        @NameInMap("ResidentArea")
        @Validation(required = true)
        public String residentArea;

        @NameInMap("TablePrivacyMode")
        @Validation(required = true)
        public Integer tablePrivacyMode;

        @NameInMap("ProjectOwnerBaseId")
        @Validation(required = true)
        public String projectOwnerBaseId;

        @NameInMap("UseProxyOdpsAccount")
        @Validation(required = true)
        public Boolean useProxyOdpsAccount;

        @NameInMap("DisableDevelopment")
        @Validation(required = true)
        public Boolean disableDevelopment;

        @NameInMap("ProjectMode")
        @Validation(required = true)
        public Integer projectMode;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("DevStorageQuota")
        @Validation(required = true)
        public String devStorageQuota;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Integer isDefault;

        @NameInMap("ProtectedMode")
        @Validation(required = true)
        public Integer protectedMode;

        @NameInMap("BaseProject")
        @Validation(required = true)
        public Boolean baseProject;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("ProjectDescription")
        @Validation(required = true)
        public String projectDescription;

        @NameInMap("Appkey")
        @Validation(required = true)
        public String appkey;

        @NameInMap("SchedulerMaxRetryTimes")
        @Validation(required = true)
        public Integer schedulerMaxRetryTimes;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("ProjectIdentifier")
        @Validation(required = true)
        public String projectIdentifier;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Integer projectId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("DevelopmentType")
        @Validation(required = true)
        public Integer developmentType;

        @NameInMap("EnvTypes")
        @Validation(required = true)
        public java.util.List<String> envTypes;

        public static GetProjectDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectDetailResponseData self = new GetProjectDetailResponseData();
            return TeaModel.build(map, self);
        }

    }

}
