// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchIndexJobRerunRequest extends TeaModel {
    /**
     * <p>The ID of the media asset. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong>,<strong><strong><strong>c48fb37407365d4f2cd8</strong></strong></strong></p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The search library.</p>
     * 
     * <strong>example:</strong>
     * <p>test-1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    /**
     * <p>The type of the job. Separate multiple types with commas (,).</p>
     * <ul>
     * <li>aiLabel: smart tagging.</li>
     * <li>face: face recognition.</li>
     * <li>mm: large visual model.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AiLabel,Face,Mm</p>
     */
    @NameInMap("Task")
    public String task;

    public static SearchIndexJobRerunRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchIndexJobRerunRequest self = new SearchIndexJobRerunRequest();
        return TeaModel.build(map, self);
    }

    public SearchIndexJobRerunRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public SearchIndexJobRerunRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public SearchIndexJobRerunRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

}
