// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitKeyWordCutJobRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("InputFile")
    public String inputFile;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Title")
    public String title;

    @NameInMap("Description")
    public String description;

    public static SubmitKeyWordCutJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitKeyWordCutJobRequest self = new SubmitKeyWordCutJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitKeyWordCutJobRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SubmitKeyWordCutJobRequest setInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public String getInputFile() {
        return this.inputFile;
    }

    public SubmitKeyWordCutJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitKeyWordCutJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitKeyWordCutJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
