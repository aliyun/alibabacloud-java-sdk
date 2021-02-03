// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitASRJobRequest extends TeaModel {
    @NameInMap("InputFile")
    public String inputFile;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Title")
    public String title;

    @NameInMap("Description")
    public String description;

    public static SubmitASRJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitASRJobRequest self = new SubmitASRJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitASRJobRequest setInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public String getInputFile() {
        return this.inputFile;
    }

    public SubmitASRJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitASRJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitASRJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
