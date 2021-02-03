// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIRJobRequest extends TeaModel {
    @NameInMap("InputFile")
    public String inputFile;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Title")
    public String title;

    @NameInMap("Description")
    public String description;

    public static SubmitIRJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIRJobRequest self = new SubmitIRJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIRJobRequest setInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public String getInputFile() {
        return this.inputFile;
    }

    public SubmitIRJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitIRJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitIRJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
