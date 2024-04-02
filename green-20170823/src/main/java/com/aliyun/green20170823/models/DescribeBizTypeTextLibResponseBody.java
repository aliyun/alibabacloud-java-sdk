// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypeTextLibResponseBody extends TeaModel {
    @NameInMap("Black")
    public DescribeBizTypeTextLibResponseBodyBlack black;

    @NameInMap("Ignore")
    public DescribeBizTypeTextLibResponseBodyIgnore ignore;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Review")
    public DescribeBizTypeTextLibResponseBodyReview review;

    @NameInMap("White")
    public DescribeBizTypeTextLibResponseBodyWhite white;

    public static DescribeBizTypeTextLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypeTextLibResponseBody self = new DescribeBizTypeTextLibResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypeTextLibResponseBody setBlack(DescribeBizTypeTextLibResponseBodyBlack black) {
        this.black = black;
        return this;
    }
    public DescribeBizTypeTextLibResponseBodyBlack getBlack() {
        return this.black;
    }

    public DescribeBizTypeTextLibResponseBody setIgnore(DescribeBizTypeTextLibResponseBodyIgnore ignore) {
        this.ignore = ignore;
        return this;
    }
    public DescribeBizTypeTextLibResponseBodyIgnore getIgnore() {
        return this.ignore;
    }

    public DescribeBizTypeTextLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBizTypeTextLibResponseBody setReview(DescribeBizTypeTextLibResponseBodyReview review) {
        this.review = review;
        return this;
    }
    public DescribeBizTypeTextLibResponseBodyReview getReview() {
        return this.review;
    }

    public DescribeBizTypeTextLibResponseBody setWhite(DescribeBizTypeTextLibResponseBodyWhite white) {
        this.white = white;
        return this;
    }
    public DescribeBizTypeTextLibResponseBodyWhite getWhite() {
        return this.white;
    }

    public static class DescribeBizTypeTextLibResponseBodyBlackAll extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeTextLibResponseBodyBlackAll build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyBlackAll self = new DescribeBizTypeTextLibResponseBodyBlackAll();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyBlackAll setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeTextLibResponseBodyBlackAll setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyBlackSelected extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeTextLibResponseBodyBlackSelected build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyBlackSelected self = new DescribeBizTypeTextLibResponseBodyBlackSelected();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyBlackSelected setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeTextLibResponseBodyBlackSelected setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyBlack extends TeaModel {
        @NameInMap("All")
        public java.util.List<DescribeBizTypeTextLibResponseBodyBlackAll> all;

        @NameInMap("Selected")
        public java.util.List<DescribeBizTypeTextLibResponseBodyBlackSelected> selected;

        public static DescribeBizTypeTextLibResponseBodyBlack build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyBlack self = new DescribeBizTypeTextLibResponseBodyBlack();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyBlack setAll(java.util.List<DescribeBizTypeTextLibResponseBodyBlackAll> all) {
            this.all = all;
            return this;
        }
        public java.util.List<DescribeBizTypeTextLibResponseBodyBlackAll> getAll() {
            return this.all;
        }

        public DescribeBizTypeTextLibResponseBodyBlack setSelected(java.util.List<DescribeBizTypeTextLibResponseBodyBlackSelected> selected) {
            this.selected = selected;
            return this;
        }
        public java.util.List<DescribeBizTypeTextLibResponseBodyBlackSelected> getSelected() {
            return this.selected;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyIgnoreAll extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeTextLibResponseBodyIgnoreAll build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyIgnoreAll self = new DescribeBizTypeTextLibResponseBodyIgnoreAll();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyIgnoreAll setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeTextLibResponseBodyIgnoreAll setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyIgnoreSelected extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeTextLibResponseBodyIgnoreSelected build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyIgnoreSelected self = new DescribeBizTypeTextLibResponseBodyIgnoreSelected();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyIgnoreSelected setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeTextLibResponseBodyIgnoreSelected setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyIgnore extends TeaModel {
        @NameInMap("All")
        public java.util.List<DescribeBizTypeTextLibResponseBodyIgnoreAll> all;

        @NameInMap("Selected")
        public java.util.List<DescribeBizTypeTextLibResponseBodyIgnoreSelected> selected;

        public static DescribeBizTypeTextLibResponseBodyIgnore build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyIgnore self = new DescribeBizTypeTextLibResponseBodyIgnore();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyIgnore setAll(java.util.List<DescribeBizTypeTextLibResponseBodyIgnoreAll> all) {
            this.all = all;
            return this;
        }
        public java.util.List<DescribeBizTypeTextLibResponseBodyIgnoreAll> getAll() {
            return this.all;
        }

        public DescribeBizTypeTextLibResponseBodyIgnore setSelected(java.util.List<DescribeBizTypeTextLibResponseBodyIgnoreSelected> selected) {
            this.selected = selected;
            return this;
        }
        public java.util.List<DescribeBizTypeTextLibResponseBodyIgnoreSelected> getSelected() {
            return this.selected;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyReviewAll extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeTextLibResponseBodyReviewAll build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyReviewAll self = new DescribeBizTypeTextLibResponseBodyReviewAll();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyReviewAll setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeTextLibResponseBodyReviewAll setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyReviewSelected extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeTextLibResponseBodyReviewSelected build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyReviewSelected self = new DescribeBizTypeTextLibResponseBodyReviewSelected();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyReviewSelected setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeTextLibResponseBodyReviewSelected setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyReview extends TeaModel {
        @NameInMap("All")
        public java.util.List<DescribeBizTypeTextLibResponseBodyReviewAll> all;

        @NameInMap("Selected")
        public java.util.List<DescribeBizTypeTextLibResponseBodyReviewSelected> selected;

        public static DescribeBizTypeTextLibResponseBodyReview build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyReview self = new DescribeBizTypeTextLibResponseBodyReview();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyReview setAll(java.util.List<DescribeBizTypeTextLibResponseBodyReviewAll> all) {
            this.all = all;
            return this;
        }
        public java.util.List<DescribeBizTypeTextLibResponseBodyReviewAll> getAll() {
            return this.all;
        }

        public DescribeBizTypeTextLibResponseBodyReview setSelected(java.util.List<DescribeBizTypeTextLibResponseBodyReviewSelected> selected) {
            this.selected = selected;
            return this;
        }
        public java.util.List<DescribeBizTypeTextLibResponseBodyReviewSelected> getSelected() {
            return this.selected;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyWhiteAll extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeTextLibResponseBodyWhiteAll build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyWhiteAll self = new DescribeBizTypeTextLibResponseBodyWhiteAll();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyWhiteAll setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeTextLibResponseBodyWhiteAll setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyWhiteSelected extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeTextLibResponseBodyWhiteSelected build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyWhiteSelected self = new DescribeBizTypeTextLibResponseBodyWhiteSelected();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyWhiteSelected setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeTextLibResponseBodyWhiteSelected setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeTextLibResponseBodyWhite extends TeaModel {
        @NameInMap("All")
        public java.util.List<DescribeBizTypeTextLibResponseBodyWhiteAll> all;

        @NameInMap("Selected")
        public java.util.List<DescribeBizTypeTextLibResponseBodyWhiteSelected> selected;

        public static DescribeBizTypeTextLibResponseBodyWhite build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeTextLibResponseBodyWhite self = new DescribeBizTypeTextLibResponseBodyWhite();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeTextLibResponseBodyWhite setAll(java.util.List<DescribeBizTypeTextLibResponseBodyWhiteAll> all) {
            this.all = all;
            return this;
        }
        public java.util.List<DescribeBizTypeTextLibResponseBodyWhiteAll> getAll() {
            return this.all;
        }

        public DescribeBizTypeTextLibResponseBodyWhite setSelected(java.util.List<DescribeBizTypeTextLibResponseBodyWhiteSelected> selected) {
            this.selected = selected;
            return this;
        }
        public java.util.List<DescribeBizTypeTextLibResponseBodyWhiteSelected> getSelected() {
            return this.selected;
        }

    }

}
