// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSearchIndexRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("IndexConfig")
    public String indexConfig;

    /**
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("IndexStatus")
    public String indexStatus;

    /**
     * <p>The category of the index. Valid values:</p>
     * <ul>
     * <li>mm: large visual model. You can use this model to describe complex visual features and identify and search for specific actions, movements, and events in videos, such as when athletes score a goal or get injured.</li>
     * </ul>
     * <blockquote>
     * <p> This feature is in the public preview phase. You can use this feature for free for 1,000 hours of videos.</p>
     * </blockquote>
     * <ul>
     * <li>face: face recognition. You can use the face recognition technology to describe face characteristics and automatically mark or search for faces in videos.</li>
     * <li>aiLabel: smart tagging. The smart tagging category is used to describe content such as subtitles and audio in videos. You can use the speech recognition technology to automatically extract, mark, and search for subtitles and dialog content from videos. This helps you quickly locate the video content that is related to specific topics or keywords.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm</p>
     */
    @NameInMap("IndexType")
    public String indexType;

    /**
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static CreateSearchIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchIndexRequest self = new CreateSearchIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateSearchIndexRequest setIndexConfig(String indexConfig) {
        this.indexConfig = indexConfig;
        return this;
    }
    public String getIndexConfig() {
        return this.indexConfig;
    }

    public CreateSearchIndexRequest setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
        return this;
    }
    public String getIndexStatus() {
        return this.indexStatus;
    }

    public CreateSearchIndexRequest setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public CreateSearchIndexRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
