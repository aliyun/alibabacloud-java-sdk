// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class HottopicNews extends TeaModel {
    /**
     * <p>List of news comments</p>
     */
    @NameInMap("Comments")
    public java.util.List<HottopicNewsComments> comments;

    /**
     * <p>News content</p>
     * 
     * <strong>example:</strong>
     * <p>新闻内容xxx</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>News title</p>
     * 
     * <strong>example:</strong>
     * <p>新闻标题xxx</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>News URL link</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxx.html">http://www.example.com/xxx.html</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static HottopicNews build(java.util.Map<String, ?> map) throws Exception {
        HottopicNews self = new HottopicNews();
        return TeaModel.build(map, self);
    }

    public HottopicNews setComments(java.util.List<HottopicNewsComments> comments) {
        this.comments = comments;
        return this;
    }
    public java.util.List<HottopicNewsComments> getComments() {
        return this.comments;
    }

    public HottopicNews setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public HottopicNews setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public HottopicNews setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class HottopicNewsComments extends TeaModel {
        /**
         * <p>News comment content</p>
         * 
         * <strong>example:</strong>
         * <p>新闻评论内容</p>
         */
        @NameInMap("Text")
        public String text;

        public static HottopicNewsComments build(java.util.Map<String, ?> map) throws Exception {
            HottopicNewsComments self = new HottopicNewsComments();
            return TeaModel.build(map, self);
        }

        public HottopicNewsComments setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
