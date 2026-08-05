// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSearchIndexRequest extends TeaModel {
    /**
     * <p>The index configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("IndexConfig")
    public String indexConfig;

    /**
     * <p>The index status. Default value: Active. Valid values:</p>
     * <ul>
     * <li>Active: activated.</li>
     * <li>Deactive: deactivated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("IndexStatus")
    public String indexStatus;

    /**
     * <p>The index type. Valid values:</p>
     * <ul>
     * <li>mm: large model visual state. Used to describe complex visual features and actions in videos. This type helps identify and search for specific actions, movements, and events in videos, such as a soccer player scoring a goal or a basketball player getting injured.<blockquote>
     * <p>The shared instance type supports up to 1,000 hours of video. After the limit is exceeded, the system no longer performs large model visual state analysis.</p>
     * </blockquote>
     * </li>
     * <li>face: automatic face recognition. Used to describe facial features in videos. Through face recognition technology, faces in videos can be automatically tagged and searched.<blockquote>
     * <p>The shared instance type supports up to 1,000,000 face analyses. After the limit is exceeded, the system no longer performs face analysis.</p>
     * </blockquote>
     * </li>
     * <li>aiLabel: intelligent tagging. The intelligent tagging index type is used to describe subtitles, speech, and other content in videos. Through text and speech recognition technology, language information such as subtitles and dialogues in videos can be automatically extracted for tagging and searching. This helps users quickly search for and locate content related to specific topics or keywords in videos.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm</p>
     */
    @NameInMap("IndexType")
    public String indexType;

    /**
     * <p>The name of the search library.</p>
     * <ul>
     * <li>If you do not specify a search library name, the search index is created in the default IMS search library. Default value: ims-default-search-lib.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2584455.html">QuerySearchLib</a> operation to query information about existing search libraries.</li>
     * </ul>
     * 
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
