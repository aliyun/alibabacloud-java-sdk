// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitKeyWordCutJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("InputFile")
    public String inputFile;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    public static SubmitKeyWordCutJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitKeyWordCutJobRequest self = new SubmitKeyWordCutJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitKeyWordCutJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitKeyWordCutJobRequest setInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public String getInputFile() {
        return this.inputFile;
    }

    public SubmitKeyWordCutJobRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SubmitKeyWordCutJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SubmitKeyWordCutJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitKeyWordCutJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
