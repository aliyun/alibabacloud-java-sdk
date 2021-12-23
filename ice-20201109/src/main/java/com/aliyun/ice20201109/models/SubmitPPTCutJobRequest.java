// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitPPTCutJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("InputFile")
    public String inputFile;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    public static SubmitPPTCutJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPPTCutJobRequest self = new SubmitPPTCutJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPPTCutJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitPPTCutJobRequest setInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public String getInputFile() {
        return this.inputFile;
    }

    public SubmitPPTCutJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SubmitPPTCutJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitPPTCutJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
