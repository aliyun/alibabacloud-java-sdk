// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertInput extends TeaModel {
    @NameInMap("InputFile")
    public MediaObject inputFile;

    @NameInMap("Name")
    public String name;

    public static MediaConvertInput build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertInput self = new MediaConvertInput();
        return TeaModel.build(map, self);
    }

    public MediaConvertInput setInputFile(MediaObject inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public MediaObject getInputFile() {
        return this.inputFile;
    }

    public MediaConvertInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
