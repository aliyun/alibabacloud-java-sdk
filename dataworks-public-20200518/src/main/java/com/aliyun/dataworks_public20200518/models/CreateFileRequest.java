// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("FileDescription")
    public String fileDescription;

    @NameInMap("FileType")
    @Validation(required = true)
    public Integer fileType;

    @NameInMap("Owner")
    public String owner;

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

    @NameInMap("DependentCloudUuidList")
    public String dependentCloudUuidList;

    @NameInMap("InputList")
    @Validation(required = true)
    public String inputList;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static CreateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileRequest self = new CreateFileRequest();
        return TeaModel.build(map, self);
    }

}
