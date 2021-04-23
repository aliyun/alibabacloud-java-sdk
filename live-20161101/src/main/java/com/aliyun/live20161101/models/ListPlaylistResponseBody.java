// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistResponseBody extends TeaModel {
    @NameInMap("ProgramList")
    public java.util.List<ListPlaylistResponseBodyProgramList> programList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static ListPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPlaylistResponseBody self = new ListPlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPlaylistResponseBody setProgramList(java.util.List<ListPlaylistResponseBodyProgramList> programList) {
        this.programList = programList;
        return this;
    }
    public java.util.List<ListPlaylistResponseBodyProgramList> getProgramList() {
        return this.programList;
    }

    public ListPlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPlaylistResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListPlaylistResponseBodyProgramList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("RepeatNumber")
        public Integer repeatNumber;

        @NameInMap("ProgramName")
        public String programName;

        @NameInMap("ProgramId")
        public String programId;

        @NameInMap("CasterId")
        public String casterId;

        @NameInMap("DomainName")
        public String domainName;

        public static ListPlaylistResponseBodyProgramList build(java.util.Map<String, ?> map) throws Exception {
            ListPlaylistResponseBodyProgramList self = new ListPlaylistResponseBodyProgramList();
            return TeaModel.build(map, self);
        }

        public ListPlaylistResponseBodyProgramList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListPlaylistResponseBodyProgramList setRepeatNumber(Integer repeatNumber) {
            this.repeatNumber = repeatNumber;
            return this;
        }
        public Integer getRepeatNumber() {
            return this.repeatNumber;
        }

        public ListPlaylistResponseBodyProgramList setProgramName(String programName) {
            this.programName = programName;
            return this;
        }
        public String getProgramName() {
            return this.programName;
        }

        public ListPlaylistResponseBodyProgramList setProgramId(String programId) {
            this.programId = programId;
            return this;
        }
        public String getProgramId() {
            return this.programId;
        }

        public ListPlaylistResponseBodyProgramList setCasterId(String casterId) {
            this.casterId = casterId;
            return this;
        }
        public String getCasterId() {
            return this.casterId;
        }

        public ListPlaylistResponseBodyProgramList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
