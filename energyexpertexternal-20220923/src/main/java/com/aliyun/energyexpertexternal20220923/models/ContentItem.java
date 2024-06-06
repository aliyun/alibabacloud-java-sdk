// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ContentItem extends TeaModel {
    @NameInMap("extInfo")
    public java.util.List<ContentItemExtInfo> extInfo;

    @NameInMap("score")
    public Double score;

    @NameInMap("text")
    public String text;

    @NameInMap("type")
    public String type;

    public static ContentItem build(java.util.Map<String, ?> map) throws Exception {
        ContentItem self = new ContentItem();
        return TeaModel.build(map, self);
    }

    public ContentItem setExtInfo(java.util.List<ContentItemExtInfo> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.List<ContentItemExtInfo> getExtInfo() {
        return this.extInfo;
    }

    public ContentItem setScore(Double score) {
        this.score = score;
        return this;
    }
    public Double getScore() {
        return this.score;
    }

    public ContentItem setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ContentItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ContentItemExtInfoPos extends TeaModel {
        @NameInMap("x")
        public Long x;

        @NameInMap("y")
        public Long y;

        public static ContentItemExtInfoPos build(java.util.Map<String, ?> map) throws Exception {
            ContentItemExtInfoPos self = new ContentItemExtInfoPos();
            return TeaModel.build(map, self);
        }

        public ContentItemExtInfoPos setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public ContentItemExtInfoPos setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class ContentItemExtInfo extends TeaModel {
        @NameInMap("alignment")
        public String alignment;

        @NameInMap("index")
        public Long index;

        @NameInMap("level")
        public Long level;

        @NameInMap("pageNum")
        public java.util.List<Long> pageNum;

        @NameInMap("pos")
        public java.util.List<ContentItemExtInfoPos> pos;

        @NameInMap("subType")
        public String subType;

        @NameInMap("text")
        public String text;

        @NameInMap("type")
        public String type;

        @NameInMap("uniqueId")
        public String uniqueId;

        public static ContentItemExtInfo build(java.util.Map<String, ?> map) throws Exception {
            ContentItemExtInfo self = new ContentItemExtInfo();
            return TeaModel.build(map, self);
        }

        public ContentItemExtInfo setAlignment(String alignment) {
            this.alignment = alignment;
            return this;
        }
        public String getAlignment() {
            return this.alignment;
        }

        public ContentItemExtInfo setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ContentItemExtInfo setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public ContentItemExtInfo setPageNum(java.util.List<Long> pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public java.util.List<Long> getPageNum() {
            return this.pageNum;
        }

        public ContentItemExtInfo setPos(java.util.List<ContentItemExtInfoPos> pos) {
            this.pos = pos;
            return this;
        }
        public java.util.List<ContentItemExtInfoPos> getPos() {
            return this.pos;
        }

        public ContentItemExtInfo setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ContentItemExtInfo setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ContentItemExtInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ContentItemExtInfo setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

}
