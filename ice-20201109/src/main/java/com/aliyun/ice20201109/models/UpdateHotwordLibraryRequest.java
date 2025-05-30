// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateHotwordLibraryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>存放名人的词库</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><em>a0052ff71efbfd4e7e6c66</em></p>
     */
    @NameInMap("HotwordLibraryId")
    public String hotwordLibraryId;

    @NameInMap("Hotwords")
    public java.util.List<Hotword> hotwords;

    /**
     * <strong>example:</strong>
     * <p>my_hotwords</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateHotwordLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotwordLibraryRequest self = new UpdateHotwordLibraryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHotwordLibraryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateHotwordLibraryRequest setHotwordLibraryId(String hotwordLibraryId) {
        this.hotwordLibraryId = hotwordLibraryId;
        return this;
    }
    public String getHotwordLibraryId() {
        return this.hotwordLibraryId;
    }

    public UpdateHotwordLibraryRequest setHotwords(java.util.List<Hotword> hotwords) {
        this.hotwords = hotwords;
        return this;
    }
    public java.util.List<Hotword> getHotwords() {
        return this.hotwords;
    }

    public UpdateHotwordLibraryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
