// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateFileRequest extends TeaModel {
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileDescription")
    public String fileDescription;

    @NameInMap("Content")
    public String content;

    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    @NameInMap("AutoRerunIntervalMillis")
    public Integer autoRerunIntervalMillis;

    @NameInMap("RerunMode")
    public String rerunMode;

    @NameInMap("Stop")
    public Boolean stop;

    @NameInMap("ParaValue")
    public String paraValue;

    @NameInMap("StartEffectDate")
    public Long startEffectDate;

    @NameInMap("EndEffectDate")
    public Long endEffectDate;

    @NameInMap("CronExpress")
    public String cronExpress;

    @NameInMap("CycleType")
    public String cycleType;

    @NameInMap("DependentType")
    public String dependentType;

    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    @NameInMap("InputList")
    public String inputList;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("FileId")
    @Validation(required = true)
    public Long fileId;

    @NameInMap("OutputList")
    public String outputList;

    public static UpdateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileRequest self = new UpdateFileRequest();
        return TeaModel.build(map, self);
    }

}
