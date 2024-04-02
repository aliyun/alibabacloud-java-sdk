// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypeImageLibResponseBody extends TeaModel {
    @NameInMap("Black")
    public DescribeBizTypeImageLibResponseBodyBlack black;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Review")
    public DescribeBizTypeImageLibResponseBodyReview review;

    @NameInMap("White")
    public DescribeBizTypeImageLibResponseBodyWhite white;

    public static DescribeBizTypeImageLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypeImageLibResponseBody self = new DescribeBizTypeImageLibResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypeImageLibResponseBody setBlack(DescribeBizTypeImageLibResponseBodyBlack black) {
        this.black = black;
        return this;
    }
    public DescribeBizTypeImageLibResponseBodyBlack getBlack() {
        return this.black;
    }

    public DescribeBizTypeImageLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBizTypeImageLibResponseBody setReview(DescribeBizTypeImageLibResponseBodyReview review) {
        this.review = review;
        return this;
    }
    public DescribeBizTypeImageLibResponseBodyReview getReview() {
        return this.review;
    }

    public DescribeBizTypeImageLibResponseBody setWhite(DescribeBizTypeImageLibResponseBodyWhite white) {
        this.white = white;
        return this;
    }
    public DescribeBizTypeImageLibResponseBodyWhite getWhite() {
        return this.white;
    }

    public static class DescribeBizTypeImageLibResponseBodyBlackAll extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeImageLibResponseBodyBlackAll build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeImageLibResponseBodyBlackAll self = new DescribeBizTypeImageLibResponseBodyBlackAll();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeImageLibResponseBodyBlackAll setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeImageLibResponseBodyBlackAll setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeImageLibResponseBodyBlackSelected extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeImageLibResponseBodyBlackSelected build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeImageLibResponseBodyBlackSelected self = new DescribeBizTypeImageLibResponseBodyBlackSelected();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeImageLibResponseBodyBlackSelected setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeImageLibResponseBodyBlackSelected setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeImageLibResponseBodyBlack extends TeaModel {
        @NameInMap("All")
        public java.util.List<DescribeBizTypeImageLibResponseBodyBlackAll> all;

        @NameInMap("Selected")
        public java.util.List<DescribeBizTypeImageLibResponseBodyBlackSelected> selected;

        public static DescribeBizTypeImageLibResponseBodyBlack build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeImageLibResponseBodyBlack self = new DescribeBizTypeImageLibResponseBodyBlack();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeImageLibResponseBodyBlack setAll(java.util.List<DescribeBizTypeImageLibResponseBodyBlackAll> all) {
            this.all = all;
            return this;
        }
        public java.util.List<DescribeBizTypeImageLibResponseBodyBlackAll> getAll() {
            return this.all;
        }

        public DescribeBizTypeImageLibResponseBodyBlack setSelected(java.util.List<DescribeBizTypeImageLibResponseBodyBlackSelected> selected) {
            this.selected = selected;
            return this;
        }
        public java.util.List<DescribeBizTypeImageLibResponseBodyBlackSelected> getSelected() {
            return this.selected;
        }

    }

    public static class DescribeBizTypeImageLibResponseBodyReviewAll extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeImageLibResponseBodyReviewAll build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeImageLibResponseBodyReviewAll self = new DescribeBizTypeImageLibResponseBodyReviewAll();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeImageLibResponseBodyReviewAll setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeImageLibResponseBodyReviewAll setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeImageLibResponseBodyReviewSelected extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeImageLibResponseBodyReviewSelected build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeImageLibResponseBodyReviewSelected self = new DescribeBizTypeImageLibResponseBodyReviewSelected();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeImageLibResponseBodyReviewSelected setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeImageLibResponseBodyReviewSelected setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeImageLibResponseBodyReview extends TeaModel {
        @NameInMap("All")
        public java.util.List<DescribeBizTypeImageLibResponseBodyReviewAll> all;

        @NameInMap("Selected")
        public java.util.List<DescribeBizTypeImageLibResponseBodyReviewSelected> selected;

        public static DescribeBizTypeImageLibResponseBodyReview build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeImageLibResponseBodyReview self = new DescribeBizTypeImageLibResponseBodyReview();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeImageLibResponseBodyReview setAll(java.util.List<DescribeBizTypeImageLibResponseBodyReviewAll> all) {
            this.all = all;
            return this;
        }
        public java.util.List<DescribeBizTypeImageLibResponseBodyReviewAll> getAll() {
            return this.all;
        }

        public DescribeBizTypeImageLibResponseBodyReview setSelected(java.util.List<DescribeBizTypeImageLibResponseBodyReviewSelected> selected) {
            this.selected = selected;
            return this;
        }
        public java.util.List<DescribeBizTypeImageLibResponseBodyReviewSelected> getSelected() {
            return this.selected;
        }

    }

    public static class DescribeBizTypeImageLibResponseBodyWhiteAll extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeImageLibResponseBodyWhiteAll build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeImageLibResponseBodyWhiteAll self = new DescribeBizTypeImageLibResponseBodyWhiteAll();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeImageLibResponseBodyWhiteAll setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeImageLibResponseBodyWhiteAll setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeImageLibResponseBodyWhiteSelected extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeBizTypeImageLibResponseBodyWhiteSelected build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeImageLibResponseBodyWhiteSelected self = new DescribeBizTypeImageLibResponseBodyWhiteSelected();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeImageLibResponseBodyWhiteSelected setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBizTypeImageLibResponseBodyWhiteSelected setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBizTypeImageLibResponseBodyWhite extends TeaModel {
        @NameInMap("All")
        public java.util.List<DescribeBizTypeImageLibResponseBodyWhiteAll> all;

        @NameInMap("Selected")
        public java.util.List<DescribeBizTypeImageLibResponseBodyWhiteSelected> selected;

        public static DescribeBizTypeImageLibResponseBodyWhite build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizTypeImageLibResponseBodyWhite self = new DescribeBizTypeImageLibResponseBodyWhite();
            return TeaModel.build(map, self);
        }

        public DescribeBizTypeImageLibResponseBodyWhite setAll(java.util.List<DescribeBizTypeImageLibResponseBodyWhiteAll> all) {
            this.all = all;
            return this;
        }
        public java.util.List<DescribeBizTypeImageLibResponseBodyWhiteAll> getAll() {
            return this.all;
        }

        public DescribeBizTypeImageLibResponseBodyWhite setSelected(java.util.List<DescribeBizTypeImageLibResponseBodyWhiteSelected> selected) {
            this.selected = selected;
            return this;
        }
        public java.util.List<DescribeBizTypeImageLibResponseBodyWhiteSelected> getSelected() {
            return this.selected;
        }

    }

}
