// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateHotwordLibraryShrinkRequest extends TeaModel {
    /**
     * <p>The description of the hotword library. It can be up to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>存放名人的词库</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the hotword library.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><em>a0052ff71efbfd4e7e6c66</em></p>
     */
    @NameInMap("HotwordLibraryId")
    public String hotwordLibraryId;

    /**
     * <p>The hotword list. You can add up to 300 hotword entries to a single library.</p>
     */
    @NameInMap("Hotwords")
    public String hotwordsShrink;

    /**
     * <p>The name of the hotword library. It can be up to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>my_hotwords</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateHotwordLibraryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotwordLibraryShrinkRequest self = new UpdateHotwordLibraryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHotwordLibraryShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateHotwordLibraryShrinkRequest setHotwordLibraryId(String hotwordLibraryId) {
        this.hotwordLibraryId = hotwordLibraryId;
        return this;
    }
    public String getHotwordLibraryId() {
        return this.hotwordLibraryId;
    }

    public UpdateHotwordLibraryShrinkRequest setHotwordsShrink(String hotwordsShrink) {
        this.hotwordsShrink = hotwordsShrink;
        return this;
    }
    public String getHotwordsShrink() {
        return this.hotwordsShrink;
    }

    public UpdateHotwordLibraryShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
