// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListCheckersForProjectResponseBody extends TeaModel {
    @NameInMap("Checkers")
    public java.util.List<ListCheckersForProjectResponseBodyCheckers> checkers;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCheckersForProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckersForProjectResponseBody self = new ListCheckersForProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckersForProjectResponseBody setCheckers(java.util.List<ListCheckersForProjectResponseBodyCheckers> checkers) {
        this.checkers = checkers;
        return this;
    }
    public java.util.List<ListCheckersForProjectResponseBodyCheckers> getCheckers() {
        return this.checkers;
    }

    public ListCheckersForProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCheckersForProjectResponseBodyCheckers extends TeaModel {
        @NameInMap("CheckerIdentifier")
        public String checkerIdentifier;

        @NameInMap("CheckerType")
        public String checkerType;

        @NameInMap("Description")
        public String description;

        @NameInMap("FileTypes")
        public String fileTypes;

        @NameInMap("HelpDocUrl")
        public String helpDocUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        public static ListCheckersForProjectResponseBodyCheckers build(java.util.Map<String, ?> map) throws Exception {
            ListCheckersForProjectResponseBodyCheckers self = new ListCheckersForProjectResponseBodyCheckers();
            return TeaModel.build(map, self);
        }

        public ListCheckersForProjectResponseBodyCheckers setCheckerIdentifier(String checkerIdentifier) {
            this.checkerIdentifier = checkerIdentifier;
            return this;
        }
        public String getCheckerIdentifier() {
            return this.checkerIdentifier;
        }

        public ListCheckersForProjectResponseBodyCheckers setCheckerType(String checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public String getCheckerType() {
            return this.checkerType;
        }

        public ListCheckersForProjectResponseBodyCheckers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCheckersForProjectResponseBodyCheckers setFileTypes(String fileTypes) {
            this.fileTypes = fileTypes;
            return this;
        }
        public String getFileTypes() {
            return this.fileTypes;
        }

        public ListCheckersForProjectResponseBodyCheckers setHelpDocUrl(String helpDocUrl) {
            this.helpDocUrl = helpDocUrl;
            return this;
        }
        public String getHelpDocUrl() {
            return this.helpDocUrl;
        }

        public ListCheckersForProjectResponseBodyCheckers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCheckersForProjectResponseBodyCheckers setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

    }

}
