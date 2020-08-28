// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public GetFileResponseData data;

    public static GetFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileResponse self = new GetFileResponse();
        return TeaModel.build(map, self);
    }

    public static class GetFileResponseDataFile extends TeaModel {
        @NameInMap("ConnectionName")
        @Validation(required = true)
        public String connectionName;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        @NameInMap("IsMaxCompute")
        @Validation(required = true)
        public Boolean isMaxCompute;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("CreateUser")
        @Validation(required = true)
        public String createUser;

        @NameInMap("BizId")
        @Validation(required = true)
        public Long bizId;

        @NameInMap("FileFolderId")
        @Validation(required = true)
        public String fileFolderId;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("FileType")
        @Validation(required = true)
        public Integer fileType;

        @NameInMap("UseType")
        @Validation(required = true)
        public Integer useType;

        @NameInMap("FileDescription")
        @Validation(required = true)
        public String fileDescription;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("CurrentVersion")
        @Validation(required = true)
        public Integer currentVersion;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("LastEditUser")
        @Validation(required = true)
        public String lastEditUser;

        @NameInMap("LastEditTime")
        @Validation(required = true)
        public Long lastEditTime;

        @NameInMap("CommitStatus")
        @Validation(required = true)
        public Integer commitStatus;

        public static GetFileResponseDataFile build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseDataFile self = new GetFileResponseDataFile();
            return TeaModel.build(map, self);
        }

    }

    public static class GetFileResponseDataNodeConfigurationInputList extends TeaModel {
        @NameInMap("Input")
        @Validation(required = true)
        public String input;

        public static GetFileResponseDataNodeConfigurationInputList build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseDataNodeConfigurationInputList self = new GetFileResponseDataNodeConfigurationInputList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetFileResponseDataNodeConfigurationOutputList extends TeaModel {
        @NameInMap("Output")
        @Validation(required = true)
        public String output;

        @NameInMap("RefTableName")
        @Validation(required = true)
        public String refTableName;

        public static GetFileResponseDataNodeConfigurationOutputList build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseDataNodeConfigurationOutputList self = new GetFileResponseDataNodeConfigurationOutputList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetFileResponseDataNodeConfiguration extends TeaModel {
        @NameInMap("TaskRerunTime")
        @Validation(required = true)
        public Integer taskRerunTime;

        @NameInMap("TaskRerunIntervalMillis")
        @Validation(required = true)
        public Integer taskRerunIntervalMillis;

        @NameInMap("RerunMode")
        @Validation(required = true)
        public String rerunMode;

        @NameInMap("Stop")
        @Validation(required = true)
        public Boolean stop;

        @NameInMap("ParaValue")
        @Validation(required = true)
        public String paraValue;

        @NameInMap("StartEffectDate")
        @Validation(required = true)
        public Long startEffectDate;

        @NameInMap("EndEffectDate")
        @Validation(required = true)
        public Long endEffectDate;

        @NameInMap("CronExpress")
        @Validation(required = true)
        public String cronExpress;

        @NameInMap("CycleType")
        @Validation(required = true)
        public String cycleType;

        @NameInMap("DependentType")
        @Validation(required = true)
        public String dependentType;

        @NameInMap("DependentNodeIdList")
        @Validation(required = true)
        public String dependentNodeIdList;

        @NameInMap("InputList")
        @Validation(required = true)
        public java.util.List<GetFileResponseDataNodeConfigurationInputList> inputList;

        @NameInMap("OutputList")
        @Validation(required = true)
        public java.util.List<GetFileResponseDataNodeConfigurationOutputList> outputList;

        public static GetFileResponseDataNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseDataNodeConfiguration self = new GetFileResponseDataNodeConfiguration();
            return TeaModel.build(map, self);
        }

    }

    public static class GetFileResponseData extends TeaModel {
        @NameInMap("File")
        @Validation(required = true)
        public GetFileResponseDataFile file;

        @NameInMap("NodeConfiguration")
        @Validation(required = true)
        public GetFileResponseDataNodeConfiguration nodeConfiguration;

        public static GetFileResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseData self = new GetFileResponseData();
            return TeaModel.build(map, self);
        }

    }

}
